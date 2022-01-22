package com.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Double_apple
 * @Date 2022/1/22 14:21
 * @Version 1.0
 */
@Controller
public class AppleTest {
    @RequestMapping("/apple")
    public String come(){
        return "apple";
    }
}
