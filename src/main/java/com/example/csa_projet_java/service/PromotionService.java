package com.example.csa_projet_java.service;

import com.example.csa_projet_java.model.Promotion;
import com.example.csa_projet_java.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;
    public List<Promotion> getAllUsers() {
        return promotionRepository.findAll();
    }

    public Optional<Promotion> getUserById(String id) {
        return promotionRepository.findById(id);
    }

    public Promotion createUser(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    public void deleteUser(String id) {
        promotionRepository.deleteById(id);
    }

}
