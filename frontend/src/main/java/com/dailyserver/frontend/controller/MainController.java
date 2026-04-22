package com.dailyserver.frontend.controller;

import com.dailyserver.frontend.client.BackendClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final BackendClient client;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("greeting", client.getHelloWorldGreetings());
        return "main";
    }
}
