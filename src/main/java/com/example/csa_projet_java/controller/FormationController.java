package com.example.csa_projet_java.controller;

import com.example.csa_projet_java.model.Formation;
import com.example.csa_projet_java.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Formation")
public class FormationController {
    @Autowired
    private FormationService formationService;
    @GetMapping
    public ResponseEntity<List<Formation>> getAllUsers() {
        List<Formation> users = formationService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formation> getUserById(@PathVariable String id) {
        Optional<Formation> user = formationService.getUserById(id);
        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Formation> createUser(@RequestBody Formation user) {
        Formation savedUser = formationService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        formationService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
