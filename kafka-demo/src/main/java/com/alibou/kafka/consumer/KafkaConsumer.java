package com.alibou.kafka.consumer;

import com.alibou.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(String.format("Consuming the message from alibou topic:: %s", msg));
    }

    @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(String.format("Consuming the message from alibou topic:: %s", student.toString()));
    }

}
