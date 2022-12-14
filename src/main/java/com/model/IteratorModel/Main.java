package com.model.IteratorModel;

import com.model.IteratorModel.Impl.BookShelf;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  15:02
 * @Description: 主程序类_迭代器_一个一个遍历
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        //创建一个能容纳4本书的书架，依次添加书籍
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 day"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Hamlet"));
        //通过bookShelf.iterator()得到的it是用于遍历书架的实例。
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){ //只要书架有下一本书，while就不会停止
            Book book = (Book)iterator.next();
            System.out.println(book.getName());

        }
    }
}
