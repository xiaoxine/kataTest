package com.model.TemplateMethodPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  13:30
 * @Description: 测试程序行为，生成Char，StringDisplay的实力，并调用了display方法。
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        //生成一个持有‘H’，的CharDisplay类的实例
        AbstractDisplay d1 = new CharDisplay('H');
        //父 子
        AbstractDisplay d2 = new StringDisplay("Hello,world.");
        AbstractDisplay d3 = new StringDisplay("breaking,bad");
        //子调用继承父的display方法
        d1.display();
        d2.display();
        d3.display();
    }
}
