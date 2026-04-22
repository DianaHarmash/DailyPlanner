package com.dailyserver.frontend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "backend", fallback = BackendFallback.class)
public interface BackendClient {

    @GetMapping("/api")
    String getHelloWorldGreetings();
}
