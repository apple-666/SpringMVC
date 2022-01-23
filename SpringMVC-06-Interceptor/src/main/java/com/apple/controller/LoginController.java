package com.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author Double_apple
 * @Date 2022/1/22 20:42
 * @Version 1.0
 */
@RequestMapping("/apple")
@Controller
public class LoginController {
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/goLogin")
    public String login() {
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model) {

        //把用户的信息存在session中
        session.setAttribute("appleuser",username);
        model.addAttribute("password",password);
        model.addAttribute("username",username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession sessionl) {
        sessionl.removeAttribute("appleuser");
        return "login";
    }
}