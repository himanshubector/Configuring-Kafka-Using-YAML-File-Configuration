package com.bector.springbootkafkaapp.consumerserviceimpl;

import com.bector.springbootkafkaapp.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumerServiceImpl
{
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);


    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "himanshu_consumer_group")
    public void consume(Student st)
    {
        logger.info(String.format("Message received: " + st.getName() + st.getRollNumber()));
    }


}
