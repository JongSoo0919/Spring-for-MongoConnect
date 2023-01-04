package com.example.demo.MongoConnectTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TEST")
public class TestController {

    @RequestMapping("/")
    public String helloWorld(){
        return "hello world!";
    }

}
