package com.apple.service.impl;

import com.apple.dao.BookMapper;
import com.apple.pojo.Book;
import com.apple.service.BookService;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/22 22:40
 * @Version 1.0
 */
public class BookServiceImpl implements BookService {
    BookMapper bookMapper = null;


    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Book book) {

        return bookMapper.addBook(book);
    }

    public int deleteBook(Integer id) {

        return bookMapper.deleteBook(id);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public Book queryBook(Integer id) {
        return bookMapper.queryBook(id);
    }

    public List<Book> queryAllBook() {

        return bookMapper.queryAllBook();
    }
}
