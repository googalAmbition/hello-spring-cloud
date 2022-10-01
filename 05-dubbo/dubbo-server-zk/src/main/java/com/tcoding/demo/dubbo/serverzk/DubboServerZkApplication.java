package com.tcoding.demo.dubbo.serverzk;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableDubbo(scanBasePackages = "com.tcoding.demo.dubbo.serverzk.service")
public class DubboServerZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServerZkApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "hello world";
    }
}
