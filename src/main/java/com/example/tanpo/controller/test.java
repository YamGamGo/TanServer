package com.example.tanpo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/api/test")
    public String test1() {
        return "푸바오";
    }
}
//ㅂ123