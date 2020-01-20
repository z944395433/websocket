package com.example.websocket.sys.service;

import com.example.websocket.sys.pojo.User;
import com.example.websocket.util.ZlRes;

public interface LoginService {
    User login(String userName,String passWord);
}
