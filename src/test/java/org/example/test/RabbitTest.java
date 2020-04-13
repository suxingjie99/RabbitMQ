package org.example.test;

import org.example.Application;
import org.example.bean.User;
import org.example.producer.Producer01;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class) // 必须加该注解,不然报错
public class RabbitTest {

    @Autowired
    private Producer01 producer01;

    @Test
    public void testSend01(){
        producer01.send(new User("lisi",20));
    }

    @Test
    public void testSend02(){
        producer01.send(new User("wangwu",20));
    }

}
