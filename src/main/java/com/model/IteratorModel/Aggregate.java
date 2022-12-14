package com.model.IteratorModel;

/**
 * 表示集合的接口
 */
public interface Aggregate {
    //该方法会生成以恶用于遍历集合的迭代器
    public abstract Iterator iterator();
}
