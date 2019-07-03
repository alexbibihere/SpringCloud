package com.example.provideTicket.config;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: yan
 * @Date: 2019/7/3/0003 23:34
 * @Description:
 */
public class GlobalHandler extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        String ip = request.getRemoteAddr();
        System.out.println("url:"+requestURI);
        System.out.println("ip:"+ip);
        return true;
    }
}
