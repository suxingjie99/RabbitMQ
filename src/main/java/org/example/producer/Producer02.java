package org.example.producer;

import org.example.bean.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer02 {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(User user){
        rabbitTemplate.convertAndSend("topic_exchange","world.111.222",user);
    }
}
