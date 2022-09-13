package com.mydemo.service;
import org.springframework.ui.Model;

public interface GetUserInfoService {

    void getUserInfoById(String id, Model model);
}
