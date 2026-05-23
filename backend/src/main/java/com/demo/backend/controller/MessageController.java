package com.demo.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MessageController {

    @GetMapping("/api/message")
    public String message() {
        return "Hello from Spring Boot Backend";
    }
}