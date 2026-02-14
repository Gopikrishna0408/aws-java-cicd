package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from EC2 CI/CD!";
    }

    @GetMapping("/")
    public String home() {
        return "Application is running!";
    }
}
