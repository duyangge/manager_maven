package com.pxxy.controller;

import com.pxxy.pojo.Users;
import com.pxxy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 功能简述:
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/7/8
 * @Date 2020/7/8 12:12
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/addUsers",method = RequestMethod.POST)
    public String addUsers(Users users){
        this.usersService.insertUsers(users);
        return "success";
    }
}
