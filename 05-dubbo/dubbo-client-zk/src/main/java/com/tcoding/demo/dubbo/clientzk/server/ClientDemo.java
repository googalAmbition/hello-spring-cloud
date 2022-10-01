package com.tcoding.demo.dubbo.clientzk.server;

import com.tcoding.demo.dubbo.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/3.
 */
@Component
public class ClientDemo {

    @DubboReference(interfaceClass = DemoService.class, version = "1.0.0")
    private DemoService demoService;

    public String rpc(String name){
        return demoService.hello(name);
    }
}

