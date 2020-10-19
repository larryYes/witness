package com.wdf.witness.service;

import com.wdf.witness.entity.Users;

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

}
