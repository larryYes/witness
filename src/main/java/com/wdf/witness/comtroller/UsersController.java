package com.wdf.witness.comtroller;

import com.wdf.witness.entity.Users;
import com.wdf.witness.entity.req.UsersReqDto;
import com.wdf.witness.service.UsersService;
import com.wdf.witness.utils.Result;
import com.wdf.witness.utils.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    @GetMapping("/findOne")
    public Result findOne(@RequestBody UsersReqDto usersReqDto){

        //test
        System.out.println(usersReqDto.getUid());
        System.out.println(usersReqDto.getName());

        Users user = usersService.findOne(usersReqDto);
        return new Result(true, StatusCode.OK,StatusCode.select,user);
    }


}
