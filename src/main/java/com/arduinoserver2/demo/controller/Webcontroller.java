package com.arduinoserver2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webcontroller {
    String str = "";
    @GetMapping("/hello")
    public String hello(@RequestParam String str) {
        this.str = str;
        return "true";
    }
    @GetMapping("/getData")
    public String getData() {
        return str;
    }

}
