package com.pxxy.mapper;

import com.pxxy.pojo.Users;

import java.util.List;

/**
 * 功能简述:
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/7/8
 * @Date 2020/7/8 9:58
 */
public interface UsersMapper {
    void insertUsers(Users users);
    List<Users> selectUsers();

}
