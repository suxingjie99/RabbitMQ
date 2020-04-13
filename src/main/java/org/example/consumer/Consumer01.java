package org.example.consumer;

import org.example.bean.User;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer01 {

    @RabbitListener(queues = {"hello_queue01"})
    public void receive(Message message, User user){
        System.out.println(user);
    }
}
