package com.example.feign.controller;

import com.example.feign.beans.User;
import com.example.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/17 17:51
 */
@RestController
public class ConsumerController {
    @Autowired
    FeignService feignService;

    @RequestMapping("/consumer")
    public String helloConsumer(){
        return feignService.hello();
    }

    @RequestMapping("/consumer2")
    public String helloConsumer2(){
        String r1 = feignService.hello("cloud");
        String r2 = feignService.hello("cloud", 23).toString();
        String r3 = feignService.hello(new User("cloud", 23));
        return r1 + "-----" + r2 + "----" + r3;
    }
}
