package com.hjl.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HJL
 * @create: 2019-03-14 10:10
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String hi(String name) {
        return String.format("hello %s , from port=%s", name, port);
    }

}
