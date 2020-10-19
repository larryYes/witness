package com.wdf.witness.dao;

import com.wdf.witness.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/19 15:06
 */

@Mapper
public interface UsersDao {


    /**
     * 查找所有User方法
     * @return
     */
    List<Users> findAll();

    /**
     * 插入操作
     */
    int addUser(Users users);

}
