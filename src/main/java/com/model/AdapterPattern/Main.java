package com.model.AdapterPattern;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  21:52
 * @Description: 通过PrintBanner适配器类来显示字符串_加个适配器以便复用
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        //需求 适配器
        //通过将对象保存在Print类型的变量中可以明确表明程序的意图，使用Print接口的方法
        Print p = new PrintBanner("Hello");
        //适配器 现实
        p.printStrong();
        p.printWeak();
    }
}
