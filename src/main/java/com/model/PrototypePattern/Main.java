package com.model.PrototypePattern;

import com.model.PrototypePattern.framework.Manager;
import com.model.PrototypePattern.framework.Product;

/**
 * @Author: long
 * @CreateTime: 2022-12-02  14:52
 * @Description: 先生成了manager的实例，在实例中注册了underLinePen的实例（带名字）和messageBox的实例
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message",upen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);
        //注册后面不要多一个空格！！
        //生成
        Product p1 = manager.create("strong message");
        p1.use("hello world.");
        Product p2 = manager.create("warning box");
        p2.use("hey man.");
        Product p3 = manager.create("slash box");
        p3.use("yoo gay");


    }
}
