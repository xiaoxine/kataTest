package com.model.AdapterPattern;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  21:47
 * @Description: 指现在实际的情况
 * @Version: 1.0
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("("+string+")");

    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
