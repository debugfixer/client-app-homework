package ru.netology.clientapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${app.message}")
    private String message;

    @GetMapping("/config")
    public String getConfig() {
        return message;
    }
}
