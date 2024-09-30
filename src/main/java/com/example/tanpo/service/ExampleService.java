package com.example.tanpo.service;

import com.example.tanpo.entity.Example;
import com.example.tanpo.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    // 모든 Example 가져오기
    public List<Example> getAllExamples() {
        return exampleRepository.findAll();
    }

    // Example 저장하기
    public Example saveExample(Example example) {
        return exampleRepository.save(example);
    }
}
