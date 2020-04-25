package com.minidwep.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/bug")
    public String buyTicket(String name){
        String forObject = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + "购买了"+forObject;
    }
}
