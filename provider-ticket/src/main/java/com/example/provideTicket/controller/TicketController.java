package com.example.provideTicket.controller;

import com.example.provideTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yan
 * @Date: 2019/3/9/0009 2:15
 * @Description:
 */
@RestController
public class TicketController {

    @Autowired
    TicketService   ticketService;

    @RequestMapping("/ticket")
    public String getTicket(){
       return ticketService.getTicket();
    }
}
