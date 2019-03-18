package com.hjl.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: HJL
 * @create: 2019-03-17 17:17
 */
public class HostAddrKeyResolver implements KeyResolver {
    /**
     * 指定根据什么限流
     * 这里根据HostAddress限流
     * @param exchange
     * @return
     */
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }
}