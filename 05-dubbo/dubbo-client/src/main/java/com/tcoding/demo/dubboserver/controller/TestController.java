package com.tcoding.demo.dubboserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 陈天成
 * @date 2022/9/26.
 */
@RestController
public class TestController {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{name}")
    public String echo(@PathVariable("name") String str) {
        return restTemplate.getForObject("http://dubbo-server/" + str, String.class);
    }
}

