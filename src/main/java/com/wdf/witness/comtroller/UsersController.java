package com.wdf.witness.comtroller;

import com.wdf.witness.entity.Users;
import com.wdf.witness.entity.req.SelectUsersReqDto;
import com.wdf.witness.entity.req.UpdateUsersReqDto;
import com.wdf.witness.service.UsersService;
import com.wdf.witness.utils.EmptyUtil;
import com.wdf.witness.utils.Result;
import com.wdf.witness.utils.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/19 15:15
 */

@Api(tags = "用户接口")
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @ApiOperation(value = "查找所有用户", produces = StatusCode.APPLICATION_JSON_UTF8_VALUE, httpMethod = "GET",response = Result.class)
    @GetMapping("/findAll")
    public Result findAll(){
        List<Users> allUsers = usersService.findAll();
        return new Result(true, StatusCode.OK,StatusCode.select,allUsers);
    }

    @ApiOperation(value = "条件查找用户", produces = StatusCode.APPLICATION_JSON_UTF8_VALUE, httpMethod = "GET",response = Result.class)
    @GetMapping("/findUser")
    public Result findOne(@RequestBody SelectUsersReqDto selectUsersReqDto){
        //uid和name不能同时为空
        if (EmptyUtil.isEmpty(selectUsersReqDto)) {
            return new Result(false,StatusCode.ISEMPTY,"查询的内容为空");
        }

        Users user = usersService.findOne(selectUsersReqDto);
        return new Result(true, StatusCode.OK,StatusCode.select,user);
    }

    @ApiOperation(value = "新增用户", produces = StatusCode.APPLICATION_JSON_UTF8_VALUE, httpMethod = "POST",response = Result.class)
    @PostMapping("/addUser")
    public Result addUser(@RequestBody Users user){

         //TODO：判断用户名是否唯一

        //判断是否为空
        if (EmptyUtil.isEmpty(user.getName()) || EmptyUtil.isEmpty(user.getPassword())){
            return new Result(false,StatusCode.LOGINERROR,"用户名或密码为空");
        }
        if (EmptyUtil.isEmpty(user.getUid())){
            usersService.addUser(user);
            return new Result(true,StatusCode.OK,StatusCode.Add);
        }
        return new Result(false,StatusCode.LOGINERROR,"id自增，传入id应为空");
    }

    @ApiOperation(value = "更新用户", produces = StatusCode.APPLICATION_JSON_UTF8_VALUE, httpMethod = "PUT",response = Result.class)
    @PutMapping("/updateUser")
    public Result updateUser(@RequestBody UpdateUsersReqDto updateUsersReqDto){

        if (EmptyUtil.isEmpty(updateUsersReqDto.getName()) && EmptyUtil.isEmpty(updateUsersReqDto.getPassword())){
            return new Result(false,StatusCode.LOGINERROR,"用户名或密码为空");
        }
        usersService.updateUser(updateUsersReqDto);
        return new Result(true,StatusCode.OK,StatusCode.update);
    }

    @ApiOperation(value = "删除用户", produces = StatusCode.APPLICATION_JSON_UTF8_VALUE, httpMethod = "DELETE",response = Result.class)
    @DeleteMapping("deleteUser/{id}")
    public Result deleteUser(@PathVariable Integer id){

        //暂停使用删除功能
        //usersService.removeUser(id);

        return new Result(true,StatusCode.OK,"删除功能停用");
    }


}
