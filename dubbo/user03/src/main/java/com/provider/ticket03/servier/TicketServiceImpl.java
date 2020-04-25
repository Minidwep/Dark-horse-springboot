package com.provider.ticket03.servier;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Component;

@Component
@Service
@EnableDubbo
//将服务发布出去
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "厉害了 我的国";
    }
}
