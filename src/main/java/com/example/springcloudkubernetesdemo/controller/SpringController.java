package com.example.springcloudkubernetesdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @Value("${database.url:local}")
    private String value;

    @GetMapping("/test-docker")
    public String getResult(){
        return "Hello, to Spring boot kubernetes project. Value: "+value;
    }
}
