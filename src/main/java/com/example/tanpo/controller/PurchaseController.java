package com.example.tanpo.controller;

import com.example.tanpo.entity.Purchase;
import com.example.tanpo.service.PurchaseService; // 구매 서비스
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PurchaseController {

    private final PurchaseService purchaseService;

    // 수동 생성자 추가
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping("/purchase")
    public ResponseEntity<String> createPurchase(@RequestBody Purchase purchase) {
        // 구매 정보를 데이터베이스에 저장
        purchaseService.savePurchase(purchase);
        return ResponseEntity.ok("구매가 완료되었습니다.");
    }
}





