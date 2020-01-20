package com.example.websocket.util;

import lombok.Data;

/**
 * @Description TODO
 * @Author YT
 * @Date 2020/1/109:53
 **/
@Data
public class ZlRes<T> {

    private String code;
    private T data;
    private String msg;

    private boolean success;


    ZlRes(String code,T data,String msg,boolean success){
        this.msg = msg;
        this.code = code;
        this.data = data;
        this.success = success;

    }

    public static <T> ZlRes<T> error(String code,String msg,T data){
        return new ZlRes<>(code,data,msg,false);
    }

    public static  <T> ZlRes<T> ok(T data){
        return new ZlRes<>("10000",data,null,true);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
