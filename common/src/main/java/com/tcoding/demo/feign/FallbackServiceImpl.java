package com.tcoding.demo.feign;

import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/1.
 */
@Component
public class FallbackServiceImpl implements FeignService {

    @Override
    public String say(String name) {
        return "fall back";
    }
}

