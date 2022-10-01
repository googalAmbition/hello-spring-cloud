package com.tcoding.demo.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 陈天成
 * @date 2022/10/1.
 */
@Configuration
@EnableFeignClients({"com.tcoding.demo.feign"})
@PropertySource(value = "classpath:feign.yaml", ignoreResourceNotFound = true)
public class FeignConfiguration {
}

