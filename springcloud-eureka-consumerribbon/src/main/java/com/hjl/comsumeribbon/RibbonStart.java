package com.hjl.comsumeribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: HJL
 * @create: 2019-03-14 10:58
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonStart {

    public static void main(String[] args) {
        SpringApplication.run(RibbonStart.class, args);
    }

    @Bean
    public RestTemplate getRestemplate() {
        return new RestTemplate();
    }

}
