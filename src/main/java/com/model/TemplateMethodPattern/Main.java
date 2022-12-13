package com.model.TemplateMethodPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  13:30
 * @Description: 测试程序行为，生成Char，StringDisplay的实力，并调用了display方法。
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello,world.");
        AbstractDisplay d3 = new StringDisplay("breaking,bad");
        d1.display();
        d2.display();
        d3.display();
    }
}
