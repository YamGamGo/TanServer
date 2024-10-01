package com.example.tanpo.service;

import com.example.tanpo.entity.Purchase;
import com.example.tanpo.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    // 생성자 주입
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    // 구매 저장 메서드
    public void savePurchase(Purchase purchase) {
        purchaseRepository.save(purchase);
    }
}