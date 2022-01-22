package com.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Double_apple
 * @Date 2022/1/22 16:03
 * @Version 1.0
 */
@Controller
public class MyTest {

    @RequestMapping("/apple")
    public String come1(){
        return "come";
    }
}
