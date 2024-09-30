package com.example.tanpo.controller;

import com.example.tanpo.entity.Example;
import com.example.tanpo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/information")
public class information {

    @Autowired
    private ExampleService exampleService;

    @GetMapping
    public List<Example> getAllExamples() {
        return exampleService.getAllExamples();
    }

    @PostMapping
    public Example addExample(@RequestBody Example example) {
        return exampleService.saveExample(example);
    }
}