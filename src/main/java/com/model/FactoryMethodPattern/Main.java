package com.model.FactoryMethodPattern;

import com.model.FactoryMethodPattern.framework.Factory;
import com.model.FactoryMethodPattern.framework.Product;
import com.model.FactoryMethodPattern.idcard.IDCardFactory;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  16:39
 * @Description: 使用framework和idcard包来制作和使用IDCard.
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小王");
        Product card3 = factory.create("小红");
        card1.use();
        card2.use();
        card3.use();

    }
}
