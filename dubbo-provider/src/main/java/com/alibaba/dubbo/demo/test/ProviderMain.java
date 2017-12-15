package com.alibaba.dubbo.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProvider.xml");
        context.start();
        System.out.println("服务启动...");
        System.in.read();
    }
}
