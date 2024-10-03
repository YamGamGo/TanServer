package com.example.tanpo.service;

import com.example.tanpo.entity.Example;
import com.example.tanpo.repository.ExampleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    private final ExampleRepository exampleRepository; // final 변수

    // 생성자 추가: ExampleRepository를 주입받음
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository; // 주입
    }

    // 모든 Example 가져오기
    public List<Example> getAllExamples() {
        return exampleRepository.findAll();
    }

    // Example 저장하기
    public Example saveExample(Example example) {
        return exampleRepository.save(example);
    }
}
