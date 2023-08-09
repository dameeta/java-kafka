package com.sample.hellokafka.controller;

import com.sample.hellokafka.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka-page/")
public class KafkaController {
    @Autowired
    MessageSender messageSender;


    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message){

        messageSender.send(message);

        return "Message sent to the topic: My_First_Topic successfully";
    }
}
