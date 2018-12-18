package com.example.feign.service;

import com.example.feign.beans.User;
import com.example.feign.dao.FeignFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/17 17:44
 */
@FeignClient(value = "hello-service",fallback = FeignFallBack.class)
public interface FeignService {
    //服务中方法的映射路径
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method= RequestMethod.POST)
    String hello(@RequestBody User user);
}
