package com.mydemo.service.impl;

import com.mydemo.service.GetUserInfoService;
import com.mydemo.mybatis.entity.User;
import com.mydemo.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class GetUserInfoServiceImpl implements GetUserInfoService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void getUserInfoById(String id, Model model)
    {
        //search by id, get UserInfo
        User user = userMapper.queryUserInfo(id);
        model.addAttribute("name", user.getId())
                .addAttribute("age", user.getAge())
                .addAttribute("height", user.getHeight())
                .addAttribute("weight", user.getWeight());
    }
}
