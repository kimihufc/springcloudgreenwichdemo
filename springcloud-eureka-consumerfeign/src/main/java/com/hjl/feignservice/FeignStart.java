package com.hjl.feignservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: HJL
 * @create: 2019-03-14 11:48
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.hjl.feign.service")
@EnableHystrix
@ComponentScan(basePackages = "com.hjl")
public class FeignStart {

      public static void main(String [] args){
            SpringApplication.run(FeignStart.class,args);
      }

}
