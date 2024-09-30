package com.example.tanpo.controller;

import com.example.tanpo.entity.User;
import com.example.tanpo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PurchaseController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/purchase")
    public ResponseEntity<String> purchase(@RequestBody User user) {
        try {
            userRepository.save(user);
            return ResponseEntity.ok("구매가 완료되었습니다.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("구매에 실패하였습니다.");
        }
    }
}

