package com.hjl.feignservice.controller;

import com.hjl.feign.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HJL
 * @create: 2019-03-14 13:46
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("")
    public String getHello(String name){
        return demoService.getHello(name);
    }

}
