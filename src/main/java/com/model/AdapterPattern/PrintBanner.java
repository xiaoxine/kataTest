package com.model.AdapterPattern;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  21:50
 * @Description: 适配器
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
