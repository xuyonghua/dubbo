package com.szxfd.dubbo.web.service.controller;

import com.szxfd.dubbo.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xuyonghua
 * @Date: 2019/7/19 14:27
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    /**
     * 测试方法，浏览器访问 /demo/index 可以看到响应结果了
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    @ResponseBody
    public String index() {
        return demoService.sayHello("xuyonghua");
    }
}
