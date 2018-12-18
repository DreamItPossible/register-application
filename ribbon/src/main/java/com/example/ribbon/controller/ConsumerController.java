package com.example.ribbon.controller;

import com.example.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/15 16:19
 */
@RestController
public class ConsumerController {

    //注入负载均衡客户端
    @Autowired
    private HelloService helloService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String helloConsumer(){
        return helloService.helloService();
    }
}
