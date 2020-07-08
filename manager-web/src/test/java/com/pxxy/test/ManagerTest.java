package com.pxxy.test;

import com.pxxy.mapper.UsersMapper;
import com.pxxy.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能简述:测试类
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/7/8
 * @Date 2020/7/8 10:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {


    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUsersTest(){
        Users  user = new Users();
        user.setUserage(23);
        user.setUsername("张三");
        usersMapper.insertUsers(user);
    }


}
