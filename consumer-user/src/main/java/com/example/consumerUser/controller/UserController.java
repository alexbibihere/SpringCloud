package com.example.consumerUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yan
 * @Date: 2019/3/9/0009 2:26
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name){
        String s =restTemplate.getForObject("http://localhost:8001/ticket",String.class);
        return name+"购买了"+s;
    }
}
