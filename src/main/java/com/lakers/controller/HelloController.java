package com.lakers.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: panyusheng
 * @Date: 2020/5/19 11:29
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping(value = "helloWorld", params = {"accountName=haha", "money!=100"})
    public String hello() {
        return "success";
    }

}
