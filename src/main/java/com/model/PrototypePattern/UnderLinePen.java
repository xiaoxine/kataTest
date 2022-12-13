package com.model.PrototypePattern;

import com.model.PrototypePattern.framework.Product;

/**
 * @Author: long
 * @CreateTime: 2022-12-02  14:48
 * @Description: 实现几乎和MessageBox完全相同
 * @Version: 1.0
 */
public class UnderLinePen implements Product {
    private char ulchar;
    public UnderLinePen(char ulchar){
        this.ulchar = ulchar;
    }
    public void use(String s){
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.print(" ");
        for(int i =0;i<length;i++){
            System.out.print(ulchar);

        }
        System.out.println();

    }
    public Product createClone(){
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
