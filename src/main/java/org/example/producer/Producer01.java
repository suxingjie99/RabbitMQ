package org.example.producer;

import org.example.bean.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer01 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(User user){
        rabbitTemplate.convertAndSend("direct_exchange","hello",user);
    }
}
