package com.model.AdapterPattern_DuiX;

import com.model.AdapterPattern.Banner;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  21:58
 * @Description: 适配器类，继承Print类，实现PrintWeak()方法，PrintWeak()方法会通过banner字段调用Banner类的showWithParen()方法。
 * @Version: 1.0
 */
public class PrintBanner extends Print{
    private Banner banner;

    /**
     * banner字段保存了Banner类的实例。
     * @param string
     */
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
