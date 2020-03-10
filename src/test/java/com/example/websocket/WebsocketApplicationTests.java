package com.example.websocket;

import com.example.websocket.sys.pojo.User;
import com.example.websocket.sys.pojo.UserVO;
import com.example.websocket.util.Add;
import com.example.websocket.util.BeanCopyUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebsocketApplicationTests {

    static void getSum(int a, int b, Add sumable) {
        int sum = sumable.add(a, b);
        System.out.println(sum);
    }

    @Test
    public void contextLoads() {

        getSum(1, 2, (a, b) ->
                a * b
        );


        List<UserVO> user = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            user.add(new UserVO().setId(i + "")
                    .setPassWord("123")
                    .setRealName("yys")
                    .setUserSex("南"));

        }
        List<User> u = new ArrayList<>();
        u = BeanCopyUtil.copyListProperties(user,User::new);
        ObjectMapper o = new ObjectMapper();
        try {
           System.out.println(o.writeValueAsString(u));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }


}
