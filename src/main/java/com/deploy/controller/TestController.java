package com.deploy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String hello() {
        String podName = System.getenv("HOSTNAME");
        return "Hello from pod: " + podName;
    }
}
