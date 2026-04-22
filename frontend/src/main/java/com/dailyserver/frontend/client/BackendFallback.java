package com.dailyserver.frontend.client;

import org.springframework.stereotype.Component;

@Component
public class BackendFallback implements BackendClient {

    @Override
    public String getHelloWorldGreetings() {
        return "Backend is unavaible!";
    }
}
