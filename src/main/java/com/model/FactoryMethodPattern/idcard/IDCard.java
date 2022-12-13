package com.model.FactoryMethodPattern.idcard;
import com.model.FactoryMethodPattern.framework.Product;
/**
 * @Author: long
 * @CreateTime: 2022-12-01  16:34
 * @Description: IDCard时Product类的子类
 * @Version: 1.0
 */
public class IDCard extends Product {
    private String owner;
    IDCard(String owner){
        System.out.println("制作"+owner+"的ID卡");
        this.owner =  owner;
    }
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
