package com.example.websocket.sys.service.serviceImpl;

import com.example.websocket.sys.mapper.LoginMapper;
import com.example.websocket.sys.pojo.User;
import com.example.websocket.sys.service.LoginService;
import com.example.websocket.util.ZlRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author YIYS
 * @Date 2020/1/2013:47
 **/
@Service
public class LoginServiceImp implements LoginService {


    @Autowired
    LoginMapper loginMapper;

    @Override
    public User login(String userName, String passWord) {
        return loginMapper.getUser(userName);
    }
}
