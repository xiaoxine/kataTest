package com.model.FactoryMethodPattern.idcard;

import com.model.FactoryMethodPattern.framework.Factory;
import com.model.FactoryMethodPattern.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: long
 * @CreateTime: 2022-12-01  16:37
 * @Description: 实现了createProduct方法和registerProduct方法。
 * @Version: 1.0
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    /**
     * 通过IDCard的实例来‘生产产品’
     * @param owner 持有人
     * @return
     */
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    /**
     * 通过将IDCard的owner保存到owners字段来实现‘注册产品’
     * @param product
     */
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
