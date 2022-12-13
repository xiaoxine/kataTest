package com.model.SingletonPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  22:37
 * @Description: Singleton类只会生成一个实例（饿汉式）
 * @Version: 1.0
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
