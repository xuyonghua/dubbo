package com.szxfd.dubbo.web.service;

import com.szxfd.dubbo.api.DemoApi;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: xuyonghua
 * @Date: 2019/7/19 14:26
 * @Description:
 */
@Service
public class DemoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoService.class);
    @Reference
    private DemoApi demoApi;

    public String sayHello(String name) {
        return demoApi.sayHello(name);
    }
}
