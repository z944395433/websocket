package com.example.websocket.sys.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 易永盛
 * @classname ${name}
 * @Description todo
 * @Date 2020/3/10 0010 22:16
 */
@Data
@Accessors(chain = true)
public class UserVO {

    private String id;
    private String userName;
    private String passWord;
    private String realName;
    private String userSex;
}
