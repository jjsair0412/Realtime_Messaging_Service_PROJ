package com.springcloud.remind_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class init {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}   
