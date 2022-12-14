package com.model.IteratorModel.Impl;

import com.model.IteratorModel.Book;
import com.model.IteratorModel.Iterator;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  14:54
 * @Description: 实现了iterator接口
 * @Version: 1.0
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int index;

    /**
     * 构造函数会将收到的bookShelf的实例保存在bookShelf字段中，并将index初始化为0。
     * @param bookShelf
     */
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;//w
    }

    /**
     * 判断书架还有没有下一本书
     * @return
     */
    public boolean hasNext() {
        if(index <bookShelf.getLength()){ //比较index和书架中的总册数
            return true;
        }else
            return false;
    }

    /**
     * 返回迭代器当前所指向的书（book的实例），并让迭代器指向下一本书
     * @return
     */
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
