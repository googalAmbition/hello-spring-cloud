package com.tcoding.demo.dubbo.clientzk;

import com.tcoding.demo.dubbo.clientzk.server.ClientDemo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableDubbo(scanBasePackages = "com.tcoding.demo.dubbo.clientzk.server")
public class DubboClientZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientZkApplication.class, args);
    }

    @Autowired
    private ClientDemo clientDemo;

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return clientDemo.rpc(name);
    }
}
