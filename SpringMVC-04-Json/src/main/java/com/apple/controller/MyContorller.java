package com.apple.controller;

import com.apple.pojo.User;
import com.apple.util.AppleJsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author Double_apple
 * @Date 2022/1/22 14:42
 * @Version 1.0
 */
//@Controller
@RestController  //restcontroller = controller + responseBody
public class MyContorller {

    //produces:指定响应体返回类型和编码
    @RequestMapping(value = "/a1")
//    @ResponseBody
    public String come1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("鹏鹏", 21);
        //System.out.println(user);

        //转换成json格式
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/a2")
    public String come2(){
        Date date = new Date();
        return AppleJsonUtils.getJson(date);
    }
}
