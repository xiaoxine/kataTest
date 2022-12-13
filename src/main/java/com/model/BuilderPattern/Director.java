package com.model.BuilderPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-03  14:08
 * @Description: 使用builder类声明的方法编写文档
 * @Version: 1.0
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder =  builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到晚上");
        builder.makeItems(new String[]{
                "早上好。",
                "晚上好。",
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();
    }
}
