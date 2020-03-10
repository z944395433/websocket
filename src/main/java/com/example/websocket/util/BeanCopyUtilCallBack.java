package com.example.websocket.util;

/**
 * @author 易永盛
 * @classname ${name}
 * @Description todo
 * @Date 2020/3/10 0010 22:08
 */
@FunctionalInterface
public interface BeanCopyUtilCallBack <S, T> {

    /**
     * 定义默认回调方法
     * @param t
     * @param s
     */
    void callBack(S t, T s);
}
