package com.wdf.witness.service;

import com.wdf.witness.entity.Users;
import com.wdf.witness.entity.req.SelectUsersReqDto;
import com.wdf.witness.entity.req.UpdateUsersReqDto;

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
     * @param selectUsersReqDto
     * @return
     */
    Users findOne(SelectUsersReqDto selectUsersReqDto);

    /**
     * 新增用户
     * @param user
     */
    void addUser(Users user);

    /**
     * 更新用户
     * @param updateUsersReqDto
     */
    void updateUser(UpdateUsersReqDto updateUsersReqDto);

    /**
     * 删除用户
     * @param id
     */
    void removeUser(Integer id);
}
