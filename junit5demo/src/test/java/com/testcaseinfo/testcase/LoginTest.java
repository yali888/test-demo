package com.testcaseinfo.testcase;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class LoginTest {
    private static HashMap<String,Object>dataMap=new HashMap<String, Object>();
    @Test
    void loginTest(){

        dataMap.put("login","登录成功");
    }
    @Nested
    class PayTest{
        @Test
        public void pay(){
            if(null!=dataMap.get("buy")){
                System.out.println("正在支付，请等待");
                System.out.println(dataMap.get("buy"));
            }
            else{
                System.out.println("还没购买，赶紧去买吧");
            }
        }
    }
    @Nested
    class BuyTest{
        @Test
        public void buy(){
            if(dataMap.get("login").equals("登录成功")){
                System.out.println("登录成功，可以购买");
                dataMap.put("buy","购买了霍格沃兹学院的名企定向培养课程");
            }
            else{
                System.out.println("没有登录，登录成功再购买");
            }
        }
    }
}
