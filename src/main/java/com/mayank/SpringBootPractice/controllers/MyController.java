package com.mayank.SpringBootPractice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoApp/")
public class MyController {

    @GetMapping("/")
    public String mapping1() {
        return "Welcome to Demo App";
    }

    @GetMapping("/api1")
    public String mapping2() {
        return "Welcome to Demo App API 1";
    }
}
