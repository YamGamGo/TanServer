package com.example.tanpo.service;

import com.example.tanpo.entity.Example;
import com.example.tanpo.repository.ExampleRepository;
import lombok.RequiredArgsConstructor; // 추가
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    public List<Example> getAllExamples() {
        return exampleRepository.findAll();
    }

    public Example saveExample(Example example) {
        return exampleRepository.save(example);
    }
}

