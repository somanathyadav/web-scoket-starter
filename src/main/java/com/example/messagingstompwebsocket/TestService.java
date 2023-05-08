package com.example.messagingstompwebsocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

@Service
public class TestService {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    public Greeting greeting123() {
        Greeting greeting = new Greeting("Hello0000000 .... , " + HtmlUtils.htmlEscape("thisssssssssssss") + "!");

        simpMessagingTemplate.convertAndSend("/topic/greetings", greeting);
        return greeting;
    }
}

