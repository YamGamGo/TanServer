package com.example.tanpo.controller;

import com.example.tanpo.entity.Example;
import com.example.tanpo.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/information")
@RequiredArgsConstructor
public class information {

    private final ExampleService exampleService; // final 필드

    @GetMapping
    public List<Example> getAllExamples() {
        return exampleService.getAllExamples();
    }
}




