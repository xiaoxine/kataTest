package com.model.TemplateMethodPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  13:22
 * @Description: AbstractDisplay类，处理的流程被定义在父类中，而具体的处理则交给了子类。
 * @Version: 1.0
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for(int i =0;i<5;i++){
            print();
        }
        close();
    }
}
