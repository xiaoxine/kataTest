package com.model.IteratorModel;

import com.model.IteratorModel.Impl.BookShelf;

/**
 * @Author: long
 * @CreateTime: 2022-11-30  15:02
 * @Description: 主程序类
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 day"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Hamlet"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());

        }
    }
}
