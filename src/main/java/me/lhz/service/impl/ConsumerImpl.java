package me.lhz.service.impl;

import me.lhz.service.Consumer;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerImpl implements Consumer {
    @Override
    @JmsListener(destination = "me.lhz.queue")
    public void receiveMsg(String message) {
        System.out.println(message);
    }
}
