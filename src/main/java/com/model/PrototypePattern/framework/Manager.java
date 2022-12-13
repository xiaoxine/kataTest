package com.model.PrototypePattern.framework;

import java.util.HashMap;

/**
 * @Author: long
 * @CreateTime: 2022-12-02  14:38
 * @Description: Manager类使用Product接口来复制实例。
 * @Version: 1.0
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product create(String Protoname){
        Product p = (Product) showcase.get(Protoname);
        return p.createClone();
    }
}
