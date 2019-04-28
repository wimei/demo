package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello/")
public class HelloResource {
    @GetMapping(value="demo")
    public String getHello(){
        return "Hello World";
    }

}
