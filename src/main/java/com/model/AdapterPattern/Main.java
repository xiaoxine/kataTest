package com.model.AdapterPattern;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  21:52
 * @Description: 通过PrintBanner类来显示字符串
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
