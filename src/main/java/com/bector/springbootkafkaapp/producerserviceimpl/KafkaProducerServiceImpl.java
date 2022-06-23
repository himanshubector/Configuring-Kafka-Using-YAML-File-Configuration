package com.bector.springbootkafkaapp.producerserviceimpl;

import com.bector.springbootkafkaapp.constants.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl
{
  /*  private static final Logger logger = LoggerFactory.getLogger(KafkaProducerServiceImpl.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topic.foo}")
    private String topicName;

    public void sendMessage(String message)
    {
        logger.info("Message send: " + message);
        kafkaTemplate.send(topicName, message);
    }*/
}
