package com.model.PrototypePattern;


import com.model.PrototypePattern.framework.Product;

/**
 * @Author: long
 * @CreateTime: 2022-12-02  14:43
 * @Description: MessageBox实现了Product接口
 * @Version: 1.0
 */
public class MessageBox implements Product{
    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    public void use(String s){
        int length =s.getBytes().length;
        for(int i = 0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar+" "+s+" "+decochar);
        for(int i = 0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println();
    }
    public Product createClone(){
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
