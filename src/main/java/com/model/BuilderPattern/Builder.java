package com.model.BuilderPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-03  14:05
 * @Description: 是一个声明了编写文档的方法的抽象类
 * @Version: 1.0
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
