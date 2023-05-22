package com.web.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping("/he")
    public String hello() {
        return "Hello";
    }


    @GetMapping("/javapoint")
    public String java() {
        return "javapoint";
    }
}
