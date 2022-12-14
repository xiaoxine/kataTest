package com.model.IteratorModel;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  14:50
 * @Description: 表示书的类
 * @Version: 1.0
 */
public class Book {
    private String name;
    public Book(String name){
        this.name = name;
    }

    /**
     * 获取书的名字
     * @return
     */
    public String getName(){
        return name;
    }
}
