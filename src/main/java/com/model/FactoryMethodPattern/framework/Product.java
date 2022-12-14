package com.model.FactoryMethodPattern.framework;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  16:29
 * @Description: 产品类，定义了产品是“任意的可以use的”东西
 * @Version: 1.0
 */
public abstract class Product {
    /**
     * 仅声明了use抽象方法
     */
    public abstract void use();

//    public abstract Product(String name);
//    因为在Java中无法定义abstract的构造函数，构造函数是不会被继承的，没有意义。
}
