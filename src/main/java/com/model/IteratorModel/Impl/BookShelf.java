package com.model.IteratorModel.Impl;

import com.model.IteratorModel.Aggregate;
import com.model.IteratorModel.Book;
import com.model.IteratorModel.Iterator;

import java.util.ArrayList;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  14:52
 * @Description: 表示书架的类
 * @Version: 1.1取消使用数组，改为使用Arrayist修改程序，确保当书的数量超过也能继续添加
 */
public class BookShelf implements Aggregate {
    /*private Book[] books; //Book类的数组 private防止外部不小心改变了该字段的值
    private int last =0;
    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);//w
    }*/

    private ArrayList books;
    public BookShelf(int initialsize){
        this.books = new ArrayList(initialsize);
    }
    public Book getBookAt(int index){
        return (Book) books.get(index);
    }
    public void appendBook(Book book){
        books.add(book);

    }
    public int getLength(){
        return books.size();
    }

    /**
     * 该方法会生成并返回BookShelfIterator类的实例作为BookShelf类对应的Iterator.当外部想要遍历书架时，就会调用这个方法。
     * @return
     */

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
