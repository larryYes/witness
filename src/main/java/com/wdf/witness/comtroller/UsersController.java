package com.wdf.witness.comtroller;

import com.wdf.witness.entity.Users;
import com.wdf.witness.service.UsersService;
import com.wdf.witness.utils.Result;
import com.wdf.witness.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/19 15:15
 */


@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @GetMapping("/findAll")
    public Result findAll(){
        List<Users> allUsers = usersService.findAll();
        return new Result(true, StatusCode.OK,StatusCode.select,allUsers);
    }



}
