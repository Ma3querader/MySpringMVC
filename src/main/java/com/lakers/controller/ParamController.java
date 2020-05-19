package com.lakers.controller;

import com.lakers.domain.Account;
import com.lakers.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @Author: panyusheng
 * @Date: 2020/5/19 14:14
 * @Version 1.0
 */
@Controller
@RequestMapping("/param")
@SessionAttributes(value = {"msg"})
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("/saveParam")
    public String saveParam(Account account){
        System.out.println("实体参数");
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/getServlet")
    public String getServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String username){
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testBody")
    public String testBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookie){
        System.out.println(cookie);
        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("account") Account account){
        System.out.println(account);
        return "success";
    }

    /**
     * 该方法会先执行，与表单提交重复的内容会被表单覆盖，表单没有的内容原封不动的传上去
     * @param uname
     * @return
     */
    @ModelAttribute
    public Account showAccount(String uname){
        System.out.println("showUser执行了");
        //通过用户名查询数据库（模拟）
        Account account = new Account();
        account.setUsername(uname);
        account.setPassword("888");
        account.setBirthday(new Date());
        return account;
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("msg","小杰");
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelmap){
        String msg = (String) modelmap.get("msg");
        System.out.println(msg);
        return "success";
    }

    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        status.setComplete();
        return "success";
    }


}
