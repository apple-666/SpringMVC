package com.apple.controller;

import com.apple.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Double_apple
 * @Date 2022/1/22 14:42
 * @Version 1.0
 */
@Controller
public class MyContorller {

    //produces:指定响应体返回类型和编码
    @RequestMapping(value = "/a1",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String come1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("秦疆一号", 12);
        //System.out.println(user);

        String str = mapper.writeValueAsString(user);
        return str;
    }
}
