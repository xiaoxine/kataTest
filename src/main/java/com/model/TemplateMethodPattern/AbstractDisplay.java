package com.model.TemplateMethodPattern;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  13:22
 * @Description: AbstractDisplay类，处理的流程被定义在父类中，而具体的处理则交给了子类。
 * @Version: 1.0
 */
public abstract class AbstractDisplay {
    /**
     * 都是抽象方法，待子类实现抽象方阿飞
     */
    public abstract void open();
    public abstract void print();
    public abstract void close();

    /**
     * 只有display方法实现
     */
    public final void display(){ //final表示在子类中无法重写display方法
        open();
        for(int i =0;i<5;i++){
            print();
        }
        close();
    }
    /**
     * 为什么不用接口呢
     * 因为AbstractDisplay角色必须实现处理的流程，可以实现一部分方法display
     * 而在接口中是无法实现方法的。
     */
}
