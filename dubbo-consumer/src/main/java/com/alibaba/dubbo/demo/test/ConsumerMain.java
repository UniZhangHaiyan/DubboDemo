package com.alibaba.dubbo.demo.test;

import com.alibaba.dubbo.demo.service.IGoodsInfoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConsumer.xml");
        context.start();
        System.out.println("客户测试");
        IGoodsInfoService goodsInfoService = (IGoodsInfoService) context.getBean("goodsInfoService");
        List<String> goodsList = goodsInfoService.getGoodsList();
        for(String str: goodsList){
            System.out.println(str);
        }
    }
}
