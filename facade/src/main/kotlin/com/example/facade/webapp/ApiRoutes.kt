package com.example.facade.webapp;

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Mono


@Configuration
public class ApiRoutes {

    @Bean
    fun apiRouter() = router {
        GET("/", { mono(it) })
    }

    fun mono(req: ServerRequest): Mono<ServerResponse> = ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8).syncBody("It works")
}


