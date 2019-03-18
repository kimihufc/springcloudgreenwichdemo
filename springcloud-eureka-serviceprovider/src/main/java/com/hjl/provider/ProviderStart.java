package com.hjl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: HJL
 * @create: 2019-03-14 09:39
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderStart {

    public static void  main(String [] args){
        SpringApplication.run(ProviderStart.class,args);
    }

}
