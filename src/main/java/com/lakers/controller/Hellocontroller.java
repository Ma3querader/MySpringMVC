package com.lakers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: panyusheng
 * @Date: 2020/5/19 11:29
 * @Version 1.0
 */
@Controller
public class Hellocontroller {

    @RequestMapping("helloWorld")
    public String hello() {
        System.out.println("hello mvc");
        return "success";
    }

}
