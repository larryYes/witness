package com.wdf.witness.service.impl;

import com.wdf.witness.dao.UsersDao;
import com.wdf.witness.entity.Users;
import com.wdf.witness.entity.req.UsersReqDto;
import com.wdf.witness.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/19 15:12
 */

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public List<Users> findAll(){
        return usersDao.findAll();
    }

    @Override
    public Users findOne(UsersReqDto usersReqDto){
        return usersDao.findOne(usersReqDto);
    }

    @Override
    public void addUser(Users user){
        usersDao.addUser(user);
    }

    //@Override
    //public int updateUser(Users user){
    //    return
    //}

    @Override
    public void removeUser(Integer id){
        usersDao.removeUser(id);
    }
}
