package com.yang.proxy;

/**
 * @author LiYang
 * @Project Name: Java-SE
 * @Package Name: com.yang.proxy
 * Created by MacBook Air on 2020/09/18.
 * Copyright © 2020 LiYang. All rights reserved.
 */
public class Hello implements IHello{
    @Override
    public void print(){
        System.out.println("Hello");
    }
}
