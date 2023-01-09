package com.example.demo.mongoconnecttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TEST")
public class TestController {

    @GetMapping("/")
    public String helloWorld(){
        return "hello world!";
    }

}
