package com.example.csa_projet_java.controller;

import com.example.csa_projet_java.model.Enseignant;
import com.example.csa_projet_java.model.Enseignant;
import com.example.csa_projet_java.service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/enseignant")
public class EnseignantController {
    @Autowired
    private EnseignantService enseignantService;
    @GetMapping
    public ResponseEntity<List<Enseignant>> getAllUsers() {
        List<Enseignant> users = enseignantService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enseignant> getUserById(@PathVariable Integer id) {
        Optional<Enseignant> user = enseignantService.getUserById(id);
        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Enseignant> createUser(@RequestBody Enseignant user) {
        Enseignant savedUser = enseignantService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        enseignantService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
