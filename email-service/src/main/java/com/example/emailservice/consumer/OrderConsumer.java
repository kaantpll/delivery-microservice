package com.example.emailservice.consumer;

import com.example.commonservice.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class OrderConsumer {

    Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);
    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event){

        LOGGER.info("Order placed product id: "+event.getProductId());
        // save email to  database (prefered mongo)
        // send an email to the customer

    }
}