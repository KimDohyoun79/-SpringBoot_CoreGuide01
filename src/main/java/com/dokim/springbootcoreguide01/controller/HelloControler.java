package com.dokim.springbootcoreguide01.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    // 고전적인 방법
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }

    // 더 올바른 방법
    @GetMapping(value = "/gethello")
    public String getHello(){
        return "get hello world";
    }
}
