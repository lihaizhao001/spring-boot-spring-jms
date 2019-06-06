package me.lhz.controller;

import me.lhz.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private Producer producer;

    @GetMapping(path="/")
    public String testSend(String msg){
        int i = 0;
        for(;;){
            producer.sendMsg("me.lhz.queue",msg);
            if(i++ == 100){
                break;
            }
        }
        return "success";
    }

}
