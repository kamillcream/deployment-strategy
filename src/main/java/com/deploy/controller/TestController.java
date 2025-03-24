package com.deploy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @Value("${instance.name:unknown-instance}")
    private String instanceName;

    @GetMapping("/")
    public String hello() {
        return "Hello from " + instanceName;
    }
}
