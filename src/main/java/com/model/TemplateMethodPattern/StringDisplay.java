package com.model.TemplateMethodPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  13:27
 * @Description: stringDisplay实现了父类的三个抽象方法
 * @Version: 1.0
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width; //以字节为单位计算出字符串长度
    /**
     * 构造器接收的字符被保存在字段中,同时字符的字节长度也保存在字段中。
     * @param string
     */
    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 重写open方法
     */
    public void open() {
        printLine();
    }

    /**
     * 在构造函数接收的字符串前后分别加上"|"并显示出来
     */
    public void print() {
        System.out.println("|"+string+"|");
    }

    public void close() {
        printLine();
    }

    /**
     * 显示字符+----------+
     */
    private void printLine(){
        System.out.print("+");
        for(int i =0;i <width;i++){
            System.out.print("-");
        }
        System.out.println("+");

    }
}
