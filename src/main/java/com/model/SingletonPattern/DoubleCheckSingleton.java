package com.model.SingletonPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-02  14:18
 * @Description: 双重检查锁实现（线程安全）
 * @Version: 1.0
 */
public class DoubleCheckSingleton {
    //解决办法就是加一个 volatile 关键字修饰 singleton ，volatile 会禁止 JVM 的指令重排，就可以保证多线程环境下的安全运行
    private volatile static DoubleCheckSingleton singleton;
    private DoubleCheckSingleton(){
        System.out.println("生成一个实例。");
    }
    public static DoubleCheckSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
