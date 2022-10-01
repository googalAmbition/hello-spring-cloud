package com.tcoding.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 陈天成
 * @date 2022/10/1.
 */

@Component
@FeignClient(name = "zk-server", contextId = "feignServer",path = "/")
public interface FeignService {

    @GetMapping("/feign/{name}")
    String say(@PathVariable("name") String name);
}

