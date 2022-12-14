package com.model.AdapterPattern;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  21:50
 * @Description: 适配器类，继承了Banner类，继承showWithParen()方法;实现了print接口，实现printWeak()方法。
 * @Version: 1.0
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string){
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
