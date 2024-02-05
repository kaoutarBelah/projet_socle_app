package com.example.csa_projet_java.controller;

import com.example.csa_projet_java.model.Promotion;
import com.example.csa_projet_java.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Promotion")
public class PromotionController {
    @Autowired
    private PromotionService promotionService;
    @GetMapping
    public ResponseEntity<List<Promotion>> getAllUsers() {
        List<Promotion> users = promotionService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Promotion> getUserById(@PathVariable String id) {
        Optional<Promotion> user = promotionService.getUserById(id);
        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Promotion> createUser(@RequestBody Promotion user) {
        Promotion savedUser = promotionService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        promotionService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
