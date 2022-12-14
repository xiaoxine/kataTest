package com.model.FactoryMethodPattern.idcard;

import com.model.FactoryMethodPattern.framework.Factory;
import com.model.FactoryMethodPattern.framework.Product;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  16:37
 * @Description: IDCardFactory类实现了createProduct方法和registerProduct方法。
 * @Version: 1.1
 */
public class IDCardFactory extends Factory {
//
//    private List owners = new ArrayList();
//    /**
//     * 通过IDCard的实例来‘生产产品’
//     * @param owner 持有人
//     * @return
//     */
//    protected Product createProduct(String owner) {
//        return new IDCard(owner);
//    }
//
//    /**
//     * 通过将IDCard的owner保存到owners字段来实现‘注册产品’
//     * @param product
//     */
//    protected void registerProduct(Product product) {
//        owners.add(((IDCard)product).getOwner());
//    }
//    public List getOwners(){
//        return owners;
//    }
//
    private HashMap database = new HashMap();
    private int serial = 100;

    /**
     * 防止程序在多线程运行时为不同的实例分配相同的编号
     * @param owner
     * @return
     */
    protected synchronized Product createProduct(String owner){
        return new IDCard(owner,serial++);
    }
    /**
     * 保存编号与所有人的关系
     */
    protected void registerProduct(Product product){
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()),card.getOwner());
    }
    public HashMap getDatabase(){
        return database;
    }



}
