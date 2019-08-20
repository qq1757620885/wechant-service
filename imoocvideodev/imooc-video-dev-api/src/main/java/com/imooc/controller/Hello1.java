package com.imooc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1 {

    @RequestMapping("/hello")
    @ResponseBody
    public String h(){
        return "hello";
    }
}
