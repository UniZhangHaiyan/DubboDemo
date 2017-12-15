package com.alibaba.dubbo.demo.service.impl;

import com.alibaba.dubbo.demo.service.IGoodsInfoService;

import java.util.ArrayList;
import java.util.List;

public class GoodsInfoServiceImpl implements IGoodsInfoService {

    public List<String> getGoodsList() {
        List<String> goodList = new ArrayList<String>();
        goodList.add("皮大衣");
        goodList.add("图书");
        goodList.add("鞋子");
        return goodList;
    }
}
