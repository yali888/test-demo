package com.testcaseinfo.testcase;

import org.junit.jupiter.api.*;

@DisplayName("junit5演示类")
public class Junit5DemoTest {
    @BeforeAll
    public static void before(){
        System.out.println("before");
    }
    @BeforeEach
    public void beforeach(){
        System.out.println("before_each");
    }
    @Test
    @DisplayName("fun测试方法")
    @RepeatedTest(5)
    public void fun(){
        System.out.println("fun");
    }
    @Test
    @DisplayName("fun1测试方法")
    @Disabled
    public void fun1(){
        System.out.println("fun1");
    }
    @Test
    @Tag("测试方法二")
    public void fun2(){
        System.out.println("fun2");
    }
    @AfterEach
    public void aftereach(){
        System.out.println("aftereach");
    }
    @AfterAll
    public static void after(){
        System.out.println("after");
    }
}
