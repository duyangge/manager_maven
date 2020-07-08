package com.pxxy.service.com.pxxy.service.impl;

import com.pxxy.mapper.UsersMapper;
import com.pxxy.pojo.Users;
import com.pxxy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能简述:
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/7/8
 * @Date 2020/7/8 12:14
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    public void insertUsers(Users users) {
        this.usersMapper.insertUsers(users);
    }
}
