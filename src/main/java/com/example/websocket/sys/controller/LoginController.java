package com.example.websocket.sys.controller;

import com.example.websocket.sys.pojo.User;
import com.example.websocket.sys.service.LoginService;
import com.example.websocket.util.OperationLog;
import com.example.websocket.util.ZlRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author YT
 * @Date 2020/1/910:49
 **/
@RestController
@RequestMapping("sys")
@Api(tags = "用户")
public class LoginController {

    @Autowired
    LoginService loginService;

    @OperationLog
    @CrossOrigin(origins = "*")
    @ApiOperation("登录")
    @GetMapping("login")
    public ZlRes<User> login(String userName, String passWord){
        User user =loginService.login(userName,passWord);

        if (user== null || !passWord.equals(user.getPassWord())) {
            return ZlRes.error("10001","账号密码错误",null);
        }

        return ZlRes.ok(loginService.login(userName,passWord));
    }


}
