package com.example.tanpo.controller;

import com.example.tanpo.entity.Purchase;
import com.example.tanpo.service.PurchaseService; // 구매 서비스
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor // Lombok을 사용하여 생성자 자동 생성
public class PurchaseController {

    private final PurchaseService purchaseService; // final 필드

    @PostMapping("/purchase")
    public ResponseEntity<String> createPurchase(@RequestBody Purchase purchase) {
        // 구매 정보를 데이터베이스에 저장
        purchaseService.savePurchase(purchase);
        return ResponseEntity.ok("구매가 완료되었습니다.");
    }
}






