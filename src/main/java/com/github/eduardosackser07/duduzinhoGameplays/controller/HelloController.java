package com.github.eduardosackser07.duduzinhoGameplays.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String hello(HttpServletRequest request) {
        return "whats up with it vanilla face\n" + request.getSession().getId();
    }
}
