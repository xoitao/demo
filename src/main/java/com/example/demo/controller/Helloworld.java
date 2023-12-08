package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping("/hello")
    public String helloworld(){
        System.out.println("master test");
        return "helloworld!!!,hello,git!,hello,git4";
    }
}
