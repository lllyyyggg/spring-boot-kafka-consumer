package com.lanyage.kafka.springbootkafkaconsumer.listener;

import com.lanyage.kafka.springbootkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed Message: " + message);
    }

    @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consume(User user) {
        System.out.println("Consumed Json Message: " + user);
    }
}
