package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "hello world~2";
    }
}
