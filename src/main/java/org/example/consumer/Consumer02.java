package org.example.consumer;

import org.example.bean.User;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer02 {

    @RabbitListener(queues = {"hello_queue02"})
    public void receive(Message message, User user){
        System.out.println(user);
    }

    @RabbitListener(queues = {"world_queue02"})
    public void receive(User user){
        System.out.println(user);
    }


}
