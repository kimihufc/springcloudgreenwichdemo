package com.hjl.feign.service.hystrix;

import com.hjl.feign.service.DemoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: HJL
 * @create: 2019-03-14 14:11
 */
@Component
public class DemoServiceHystrix implements DemoService {

    @Override
    public String getHello(@RequestParam(value = "name") String name) {
        return "fail";
    }
}
