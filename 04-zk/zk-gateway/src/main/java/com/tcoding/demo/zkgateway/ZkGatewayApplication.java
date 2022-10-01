package com.tcoding.demo.zkgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkGatewayApplication.class, args);
    }
}
