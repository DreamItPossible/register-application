package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/18 11:30
 */
@RestController
public class TestController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    @RequestMapping("/test")
    public String test(){
        return this.name + this.age;
    }
}
