package com.tcoding.demo.macoscserver.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/10/21.
 */
@RestController
public class SentinelController {

    // @SentinelResource
    @GetMapping("/")
    public String hello() {
        return "hello world";
    }
}

