package com.example.projecttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/index")
//    @ResponseBody
    public String testHello(){
        System.out.println("request!");
        return "index1.html";
    }
}
