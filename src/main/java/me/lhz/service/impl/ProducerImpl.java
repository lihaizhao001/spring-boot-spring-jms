package me.lhz.service.impl;

import me.lhz.service.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProducerImpl implements Producer {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;


    @Override
    public void sendMsg(String destinationName, String message) {
        jmsMessagingTemplate.convertAndSend(new ActiveMQQueue(destinationName), message);
    }
}
