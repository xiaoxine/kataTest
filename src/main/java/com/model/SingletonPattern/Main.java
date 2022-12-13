package com.model.SingletonPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  22:38
 * @Description: 调用两次Singleton类的getInstance方法获取实例，并将对象分别保存到s1和s2中
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start.");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2){
            System.out.println("s1与s2是相同的实例");
        }else
            System.out.println("s1与s2是不相同的实例");

        LazySingleton s11 = LazySingleton.getInstance();
        LazySingleton s22 = LazySingleton.getInstance();
        if(s11 == s22){
            System.out.println("s1与s2是相同的实例");
        }else
            System.out.println("s1与s2是不相同的实例");
        System.out.println("End.");
    }
}
