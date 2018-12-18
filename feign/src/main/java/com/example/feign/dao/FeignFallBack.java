package com.example.feign.dao;

import com.example.feign.beans.User;
import com.example.feign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: tchen
 * @Description:
 * @Date: 2018/12/17 17:48
 */
@Component
public class FeignFallBack implements FeignService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User();
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
