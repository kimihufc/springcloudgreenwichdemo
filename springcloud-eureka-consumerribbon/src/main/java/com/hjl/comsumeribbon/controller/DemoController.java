package com.hjl.comsumeribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: HJL
 * @create: 2019-03-14 11:10
 */
@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "")
    public String hello(String name){
        return restTemplate.getForObject("http://springcloud-eureka-serviceprovider?name="+name,String.class);
    }

}
