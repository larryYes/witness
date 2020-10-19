package com.wdf.witness.service;

import com.wdf.witness.entity.Users;
import com.wdf.witness.entity.req.UsersReqDto;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/19 15:11
 */

public interface UsersService {


    /**
     * 查找所有User方法
     * @return
     */
    List<Users> findAll();

    /**
     * 查询指定用户
     */
    Users findOne(UsersReqDto usersReqDto);
}
