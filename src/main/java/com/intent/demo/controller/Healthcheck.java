package com.intent.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {
    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "I'm alive";
    }
}
