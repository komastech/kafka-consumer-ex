package com.komastech.kafka_consumer_ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics="komastech-top3",groupId = "jt-group-1")
    public void consume(String message){
        logger.info("consumer : {} ", message);
    }
}
