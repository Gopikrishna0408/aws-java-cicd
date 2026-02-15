package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")    
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Urmila welcome to aws EC2 CI/CD! platform";
    }

    @GetMapping("/home")
    public String home() {
        return "Application is running!";
    }
}
