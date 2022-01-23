package com.apple.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author Double_apple
 * @Date 2022/1/22 20:48
 * @Version 1.0
 */
public class AppleLoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();

        if (request.getRequestURI().contains("goLogin")) {
            return true;
        }
        if (request.getRequestURI().contains("login")) {
            return true;
        }
        if (httpSession.getAttribute("appleuser") != null) {
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
