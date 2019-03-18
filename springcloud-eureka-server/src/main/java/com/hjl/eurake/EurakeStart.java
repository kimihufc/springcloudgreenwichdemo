package com.hjl.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: HJL
 * @create: 2019-03-13 20:44
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeStart {

    public static void main(String [] args){
        SpringApplication.run(EurakeStart.class,args);
    }

}
