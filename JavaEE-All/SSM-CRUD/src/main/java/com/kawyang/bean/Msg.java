package com.kawyang.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiYang
 * 通用的专门为了返回Json 数据的类
 */
public class Msg {

    //状态码
    private int code;
    //提示信息
    private String msg;
    //用户要返回给浏览器的信息
    private Map<String,Object > extend = new HashMap<>();

    /** 设计模式 ？？*/
    public static Msg success(){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("处理成功！");
        return msg;
    }

    public static Msg fail(){
        Msg msg = new Msg();
        msg.setCode(100);
        msg.setMsg("处理失败！");
        return msg;
    }

    public Msg add(String key,Object value){
        this.getExtend().put(key,value);
        return this;
    }
    public Msg() {
    }

    public Msg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
