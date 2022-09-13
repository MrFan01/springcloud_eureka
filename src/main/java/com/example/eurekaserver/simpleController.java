package com.example.eurekaserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleController {

    @RequestMapping("test")
    public String testInterface(){
        return "hello world";
    }

}
