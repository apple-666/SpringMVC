package com.apple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Double_apple
 * @Date 2022/1/22 16:25
 * @Version 1.0
 */
@RestController
public class AppleT {

    @RequestMapping("/apple")
    public String come(){
        System.out.println("come方法执行中");
        return "Apple come to";
    }
}
