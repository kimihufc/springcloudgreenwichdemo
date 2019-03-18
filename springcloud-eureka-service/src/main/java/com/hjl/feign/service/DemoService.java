package com.hjl.feign.service;

import com.hjl.feign.service.hystrix.DemoServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: HJL
 * @create: 2019-03-14 11:42
 */
@FeignClient(value = "springcloud-eureka-serviceprovider",fallback = DemoServiceHystrix.class)
public interface DemoService {

    @GetMapping(value = "")
    String getHello(@RequestParam(value = "name") String name);

}
