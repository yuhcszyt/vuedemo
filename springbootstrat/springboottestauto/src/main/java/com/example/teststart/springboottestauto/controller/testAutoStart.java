package com.example.teststart.springboottestauto.controller;

import com.yu.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testAutoStart {

    @Autowired
    private  HelloService helloService;

    @GetMapping("/test")
    public String sayHello(){

        return helloService.sayHello("haha");
    }

}
