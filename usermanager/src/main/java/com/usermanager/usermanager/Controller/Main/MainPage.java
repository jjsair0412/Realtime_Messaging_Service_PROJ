package com.usermanager.usermanager.Controller.Main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usermanager.usermanager.Domain.DTO.MainDomain;

@Controller
@RequestMapping("/user")
public class MainPage {
    
    @Value("${server.port}")
    private String port;

    @GetMapping
    public String mainpageString(@ModelAttribute MainDomain mainDomain){
        return "hello";
    }
}
