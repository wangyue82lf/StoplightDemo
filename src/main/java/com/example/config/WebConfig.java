package com.example.config;

import com.example.handler.ItemInfoHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration
@Slf4j
public class WebConfig {

    @Bean
    public RouterFunction<ServerResponse> routes(ItemInfoHandler itemhandler) {
        return RouterFunctions
                .route(POST("/hello"), itemhandler::handle);
    }
}
