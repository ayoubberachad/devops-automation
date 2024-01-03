package com.ber.devopsautomation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String message(){
        return "welcome Home!";
    }

}
