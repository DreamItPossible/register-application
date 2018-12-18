package com.example.provider.controller;

import com.example.provider.beans.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/15 17:11
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello01";
    }

    //新增的方法
    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello (@RequestBody User user) {
        return "Hello "+ user. getName () + ", " + user. getAge ();
    }
}
