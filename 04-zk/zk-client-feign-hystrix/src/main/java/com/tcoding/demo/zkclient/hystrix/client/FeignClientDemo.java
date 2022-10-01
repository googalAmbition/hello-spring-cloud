package com.tcoding.demo.zkclient.hystrix.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tcoding.demo.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/10/1.
 */
@RestController
@RequestMapping
public class FeignClientDemo {

    @Autowired
    private FeignService feignService;

    @GetMapping("/say")
    @HystrixCommand(fallbackMethod = "")
    public String say() {
        return feignService.say("world");
    }
}

