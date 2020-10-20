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

    /**
     * 新增用户
     */
    void addUser(Users user);

    /**
     * 更新用户
     */
    //int updateUser(Users user);

    /**
     * 删除用户
     */
    void removeUser(Integer id);
}
