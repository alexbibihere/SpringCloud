package com.example.consumerUser.controller;

import com.example.consumerUser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name){
        String s =restTemplate.getForObject("http://localhost:8001/ticket",String.class);
        return name+"购买了"+s;
    }

    @GetMapping("/user")
    public User findById(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("provider-ticket");

        System.out.println("serviceId:"+serviceInstance.getServiceId());
        System.out.println("host:"+serviceInstance.getHost());
        System.out.println("port:"+ serviceInstance.getPort());


        return this.restTemplate.getForObject("http://provider-ticket/hello",User.class);

    }
}
