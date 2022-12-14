package com.model.IteratorModel;

/**
 * 接口用来遍历集合中的元素，声明了两个方法
 */

public interface Iterator {
    /**
     * 判断是否存在下一个元素的HasNest方法
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    public abstract Object next();
}
