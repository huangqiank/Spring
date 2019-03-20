package com.qhuang;

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;import java.lang.String;import java.lang.System;

public class TestHelloWorld {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld test = (HelloWorld) applicationContext.getBean("HelloWorld");
        System.out.println(test.getMessage());
    }
}