package com.example.websocket.sys.mapper;

import com.example.websocket.sys.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface LoginMapper {

    @Select("select * from user where user_name = #{userName}")
    User getUser(String userName);
}
