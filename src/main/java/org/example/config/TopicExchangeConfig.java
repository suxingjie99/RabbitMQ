package org.example.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.amqp.core.Binding.DestinationType.QUEUE;

@Configuration
public class TopicExchangeConfig {
    @Bean
    public Queue helloQueue02(){
        return new Queue("hello_queue02",
                true, // 是否持久化
                false, // 是否排他
                false); // 是否自动删除
    }

    @Bean
    public Queue worldQueue02(){
        return new Queue("world_queue02",
                true, // 是否持久化
                false, // 是否排他
                false); // 是否自动删除
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topic_exchange",
                true,
                false);
    }

    @Bean
    public Binding helloBinding02(){
        return new Binding("hello_queue02",
                QUEUE,
                "topic_exchange",
                "*.hello",null);
    }

    @Bean
    public Binding worldBinding02(){
        return new Binding("world_queue02",
                QUEUE,
                "topic_exchange",
                "world.#",null);
    }
}
