package com.lakers.controller;

import com.lakers.domain.Account;
import com.lakers.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: panyusheng
 * @Date: 2020/5/20 0:39
 * @Version 1.0
 */
@Controller
@RequestMapping("/model")
public class ModelController {

    @RequestMapping("/testModel")
    public String testModel(Model model){
        System.out.println("进入control层");
        Account account = new Account();
        account.setUsername("通天塔");
        account.setPassword("jiji");
        model.addAttribute(account);
//        int i = 1/0;
        return "success";
    }

    @RequestMapping("/testJsp")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编写请求转发的程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        //重定向(重定向无法请求/WEB-INF/pages中的jsp文件)
        System.out.println(request.getContextPath());
        response.sendRedirect(request.getContextPath()+"/response.jsp");

        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //直接会进行响应
//        response.getWriter().print("撒大声地");
//        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv = new ModelAndView();

        Account account = new Account();
        account.setUsername("须藤京一");
        account.setPassword("123456");

        mv.addObject("account",account);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        //请求的转发
//        return "forward:/WEB-INF/pages/success.jsp";
        //重定向
        return "redirect:/response.jsp";
    }



}
