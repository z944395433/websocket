package com.example.websocket.sys.pojo;

import lombok.Data;

/**
 * @Description TODO
 * @Author YIYS
 * @Date 2020/1/2011:38
 **/
@Data
public class User {


    private String id;
    private String userName;
    private String passWord;
    private String realName;
    private String userSex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
