package com.pucpr.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {

    @GetMapping("/")
    public String init() {
        return "Hello World CI";
    }

}
