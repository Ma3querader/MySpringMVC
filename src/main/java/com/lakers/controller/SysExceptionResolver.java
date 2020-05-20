package com.lakers.controller;

import com.lakers.exception.SysException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: panyusheng
 * @Date: 2020/5/20 9:52
 * @Version 1.0
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        //获取到异常对象
        SysException sysException = null;
        if (e instanceof SysException){
            sysException = (SysException) e;
        }else {
            sysException = new SysException("系统正在维护。。。");
        }

        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",sysException.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
