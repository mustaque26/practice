package com.example.dockerdemo.com.example.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DockerDemoController {

    @RequestMapping("/api1")
    @GetMapping
    public String homepage(){
        return "Testing for swagger";
    }

}
