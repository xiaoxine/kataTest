package com.model.SingletonPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-02  14:10
 * @Description:  先不创建实例，当第一次被调用时，再创建实例，所以被称为懒汉式。
 * @Version: 1.0
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){
        System.out.println("实例被创建了");
    }
    public static synchronized LazySingleton getInstance(){ //synchronized在get方法上加了一把锁。
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
