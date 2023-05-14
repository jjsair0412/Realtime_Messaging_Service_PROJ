package com.springcloud.remind_project.SpringCloudConfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Router {
    
    @Bean
    public RouteLocator gatewayLocator(RouteLocatorBuilder builder){
        return builder.routes()
            .route(r -> r.path("/user")
                .filters(arg -> arg.addRequestParameter("hello", "SCG"))
                .uri("http://127.0.0.1:8000")
            ).build();
    }
}
