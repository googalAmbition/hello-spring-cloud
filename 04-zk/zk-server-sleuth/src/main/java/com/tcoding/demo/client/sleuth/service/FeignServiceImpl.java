package com.tcoding.demo.client.sleuth.service;

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

    @GetMapping("/feign/{name}")
    public String say(@PathVariable("name") String name) {
        return "hello " + name;
    }
}

