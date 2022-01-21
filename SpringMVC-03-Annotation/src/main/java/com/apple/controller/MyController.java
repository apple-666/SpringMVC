package com.apple.controller;

import com.apple.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Double_apple
 * @Date 2022/1/21 0:50
 * @Version 1.0
 */

@Controller
public class MyController {

    //请求的映射地址
    @RequestMapping(value = "/add/{a}/{b}", method = {RequestMethod.GET})
    public String apple(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("msg", "" + (a + a + b));
//        配置视图解析器的写法 默认为转发
        return "res";
//        return "redirect:/index.jsp";
    }

    @RequestMapping(value = "/hell", method = {RequestMethod.GET})
    public String apple2(Model model) {
        //不配值视图解析器的 写法
        // 默认是转发 地址栏不改变
//        return "/WEB-INF/jsp/res.jsp";
        return "redirect:index.jsp";//重定向的 jsp只能在web之下
    }


    //处理请求地址中的参数
    @RequestMapping("/apple")
    public String apple3(@RequestParam("aa") String a) {
        System.out.println(a);
//        配置视图解析器的写法 默认为转发
//        return "res";
//        return "redirect:/index.jsp";
        return "url";
    }

    //处理请求地址中的参数
    @RequestMapping("/book1")
    public String apple4(Book book) {
        System.out.println(book);
//        配置视图解析器的写法 默认为转发
//        return "res";
//        return "redirect:/index.jsp";
        return "url";
    }
}
