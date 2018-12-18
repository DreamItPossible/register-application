package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/17 11:03
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return restTemplate.getForObject("http://HELLO-SERVICE/hello",String.class);
    }

    public String helloFallback(){
        return "老铁，出故障了！";
    }
}
