package com.iiit.train.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/hellow")
    public String hellow(){
        return "service1 's hellow";
    }

}
