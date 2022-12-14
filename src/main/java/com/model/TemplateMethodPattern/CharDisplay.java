package com.model.TemplateMethodPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  13:24
 * @Description: charDisplay实现了父类的三个抽象方法
 * @Version: 1.0
 */
public class CharDisplay extends AbstractDisplay{
    private char ch; //需要显示的字符

    /**
     * 构造器接收的字符被保存在字段中
     * @param ch
     */
    public CharDisplay(char ch){
        this.ch = ch;
    }
    public void open() {
        System.out.print("<<");
    }

    /**
     * 显示构造器接受的一个字符
     */
    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>");
    }
}
