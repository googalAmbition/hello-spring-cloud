package com.tcoding.demo.client.sleuth.service;

import com.tcoding.demo.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/10/1.
 */
@RestController
@RequestMapping
public class FeignServiceImpl {

    @Autowired
    private FeignService feignService;

    @GetMapping("/feign/{name}")
    public String say(@PathVariable("name") String name) {
        return feignService.say(name);
    }
}

