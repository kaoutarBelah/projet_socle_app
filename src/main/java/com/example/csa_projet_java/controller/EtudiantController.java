package com.example.csa_projet_java.controller;

import com.example.csa_projet_java.model.Etudiant;
import com.example.csa_projet_java.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping
    public ResponseEntity<List<Etudiant>> getAllUsers() {
        List<Etudiant> users = etudiantService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> getUserById(@PathVariable Long id) {
        Optional<Etudiant> user = etudiantService.getUserById(id);
        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Etudiant> createUser(@RequestBody Etudiant user) {
        Etudiant savedUser = etudiantService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Etudiant> updateUser(@PathVariable Long id, @RequestBody Etudiant userDetails) {
        Etudiant updatedUser = etudiantService.updateUser(id, userDetails);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        etudiantService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
