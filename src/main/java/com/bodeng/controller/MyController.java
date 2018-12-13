package com.bodeng.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class MyController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
