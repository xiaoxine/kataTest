package com.model.AdapterPattern_DuiX;

import com.model.AdapterPattern.Banner;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  21:58
 * @Description: TODO
 * @Version: 1.0
 */
public class PrintBanner extends Print{
    private Banner banner;
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
