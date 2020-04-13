package org.example.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.amqp.core.Binding.DestinationType.QUEUE;

@Configuration
public class DirectExchangeConfig {

    @Bean
    public Queue helloQueue01(){
        return new Queue("hello_queue01",
                true, // 是否持久化
                false, // 是否排他
                false); // 是否自动删除
    }

    @Bean
    public Queue worldQueue01(){
        return new Queue("world_queue01",
                true, // 是否持久化
                false, // 是否排他
                false); // 是否自动删除
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("direct_exchange",
                true, // 是否持久化
                false); //是否自动删除
    }

    @Bean
    public Binding helloBinding01(){
        return new Binding("hello_queue01",
                QUEUE,
                "direct_exchange",
                "hello",null);
    }

    @Bean
    public Binding worldBinding01(){
        return new Binding("world_queue01",
                QUEUE,
                "direct_exchange",
                "world",null);
    }
}
