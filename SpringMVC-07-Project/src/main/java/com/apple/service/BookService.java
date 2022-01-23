package com.apple.service;

import com.apple.pojo.Book;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/22 22:38
 * @Version 1.0
 */
public interface BookService {
    int addBook(Book book);
    // 根据id 删除
    int deleteBook(Integer id);

    // update book
    int updateBook(Book book);

    //select 一本书
    Book queryBook(Integer id);

    //list all
    List<Book> queryAllBook();
}
