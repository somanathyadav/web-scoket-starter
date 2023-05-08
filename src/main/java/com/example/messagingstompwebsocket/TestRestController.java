package com.example.messagingstompwebsocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @Autowired
    TestService testService;


    @GetMapping("/greet-me")
    public Greeting sendMessageToTopic() {
        return testService.greeting123();
    }


}