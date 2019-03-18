package com.hjl.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: HJL
 * @create: 2019-03-14 15:16
 */
@Configuration
public class GatewayConfig {


    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
            .route(p -> p
                .path("/get")
                .filters(f -> f.addRequestHeader("Hello", "World"))
                .uri("http://httpbin.org:80"))
            .build();
    }

    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        return new HostAddrKeyResolver();
    }
}
