package com.mydemo;

import com.mydemo.mybatis.entity.User;
import com.mydemo.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        //执行sql方法
        List<User> userList = userMapper.getUserList();

        //输出结果
        for(User user : userList){
            System.out.println(userMapper.queryUserInfo(user.getId()));
        }
    }

}
