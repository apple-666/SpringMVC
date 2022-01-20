package com.apple.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Double_apple
 * @Date 2022/1/20 23:43
 * @Version 1.0
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String para = req.getParameter("apple");
        if(para.equals("comeon")){
            req.getSession().setAttribute("msg","得了吧");
        }else if(para.equals("comeback")){
            req.getSession().setAttribute("msg","又回去了");
        }
        req.getRequestDispatcher("/res.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
