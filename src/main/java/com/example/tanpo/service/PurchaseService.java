package com.example.tanpo.service;

import com.example.tanpo.entity.Purchase;
import com.example.tanpo.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    public void savePurchase(Purchase purchase) {
        purchaseRepository.save(purchase);
    }
}

