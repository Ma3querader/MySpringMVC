package com.lakers.Intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: panyusheng
 * @Date: 2020/5/20 10:08
 * @Version 1.0
 */
public class MyIntercepter1 implements HandlerInterceptor {

    /**
     * 预处理，controller方法执行前
     * return true:放行，执行下一个拦截器。如果没有，执行conroller方法
     * return false：不放行
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preInterceptor运行成功");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postInterceptor运行成功");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterInterceptor运行成功");
    }

}
