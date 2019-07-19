package com.szxfd.dubbo.service.impl;

import com.szxfd.dubbo.api.DemoApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: xuyonghua
 * @Date: 2019/7/19 15:18
 * @Description:
 */
@Service
public class DemoApiImpl implements DemoApi {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot with dubbo-2.7.1)";
    }
}
