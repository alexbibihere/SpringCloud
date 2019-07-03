package com.example.provideTicket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: yan
 * @Date: 2019/7/3/0003 23:36
 * @Description:
 */
@Configuration
public class GlobalUrlConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new GlobalHandler()).addPathPatterns("/**");
    }
}
