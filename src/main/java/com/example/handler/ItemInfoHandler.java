package com.example.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class ItemInfoHandler {

    public Mono<ServerResponse> handle(ServerRequest request) {
        return Mono.empty();
    }
}
