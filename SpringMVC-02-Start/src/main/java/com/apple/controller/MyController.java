package com.apple.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Double_apple
 * @Date 2022/1/21 0:50
 * @Version 1.0
 */
public class MyController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        //封装对象，放在ModelAndView中。Model
        mv.addObject("msg","apple come on!");
        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("res"); //: /WEB-INF/jsp/res.jsp
        return mv;
    }
}
