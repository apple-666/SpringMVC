package com.apple.controller;

import com.apple.pojo.Book;
import com.apple.service.BookService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/22 23:24
 * @Version 1.0
 */
@Controller
@RequestMapping("/apple")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService  bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String addBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addtBook(Book book){
        bookService.addBook(book);
        return "redirect:/apple/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model,int id){
        Book book = bookService.queryBook(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model,Book book){
        bookService.updateBook(book);
        Book book1 = bookService.queryBook(book.getBookID());
        model.addAttribute("book",book1);
        return "redirect:/apple/allBook";
    }

    @RequestMapping("/del/{bookid}")
    public String deleteBook(@PathVariable("bookid") int  id){
        bookService.deleteBook(id);
        return "redirect:/apple/allBook";
    }
}
