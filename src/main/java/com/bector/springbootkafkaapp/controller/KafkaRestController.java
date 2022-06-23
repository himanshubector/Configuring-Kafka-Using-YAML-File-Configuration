package com.bector.springbootkafkaapp.controller;


import com.bector.springbootkafkaapp.model.Student;
import com.bector.springbootkafkaapp.producerserviceimpl.KafkaProducerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaRestController
{
   /* @Autowired
    private KafkaProducerServiceImpl producerService;*/

    @Autowired
    private KafkaTemplate<String, Student> kafkaTemplate;

    @Value("${spring.kafka.topic.name}")
    private String topicName;


    @RequestMapping(value = "/publish")
    public String sendMessageToKafkaTopic(@RequestBody Student student)
    {
        kafkaTemplate.send(topicName, student);
        return "Message Published......";


        //  producerService.send(student);
        //        return "Message Published..";
    }
}
