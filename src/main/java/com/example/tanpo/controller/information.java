package com.example.tanpo.controller;

import com.example.tanpo.entity.Example;
import com.example.tanpo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/information")
public class information {

    private final ExampleService exampleService; // final 필드

    // 생성자 주입
    @Autowired // 스프링이 이 생성자를 사용하여 의존성을 주입
    public information(ExampleService exampleService) {
        this.exampleService = exampleService; // 필드 초기화
    }

    @GetMapping
    public List<Example> getAllExamples() {
        return exampleService.getAllExamples();
    }
}




