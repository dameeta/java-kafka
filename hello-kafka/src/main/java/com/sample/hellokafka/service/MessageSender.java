package com.sample.hellokafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    String sampleTopic = "My_First_Topic";

    public  void  send(String message)
    {
        kafkaTemplate.send(sampleTopic,message);
    }


}
