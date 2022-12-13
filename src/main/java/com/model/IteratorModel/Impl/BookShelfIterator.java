package com.model.IteratorModel.Impl;

import com.model.IteratorModel.Book;
import com.model.IteratorModel.Iterator;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  14:54
 * @Description: TODO
 * @Version: 1.0
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;//w
    }


    public boolean hasNext() {
        if(index <bookShelf.getLength()){
            return true;
        }else
            return false;
    }

    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
