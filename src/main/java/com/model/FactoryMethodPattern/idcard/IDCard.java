package com.model.FactoryMethodPattern.idcard;
import com.model.FactoryMethodPattern.framework.Product;
/**
 * @Author: long
 * @CreateTime: 2022-12-01  16:34
 * @Description: IDCard是Product类的子类
 * @Version: 1.0
 */
public class IDCard extends Product {

    //卡的编号
    private int serial;
    private String owner;
    /**
     * 这里的构造函数没有public，
     * 是想让idcard包外的类无法new出IDCard的实例，这样可以强迫通过IDCardFactory来生成IDCard的实例。
     */
    IDCard(String owner,int serial){
        System.out.println("制作"+owner+"("+serial+")"+"的ID卡");
        this.owner =  owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println("使用"+owner+"("+serial+")"+"的ID卡");
    }

    public String getOwner() {
        return owner;
    }
    public int getSerial(){
        return serial;
    }
}
