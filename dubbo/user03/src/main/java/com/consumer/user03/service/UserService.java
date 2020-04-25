package com.consumer.user03.service;


import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Service;
import com.provider.ticket03.servier.TicketService;

@Service
@EnableDubbo
public class UserService {
    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了"+ticket);
    }
}
