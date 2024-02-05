package com.example.csa_projet_java.service;


import com.example.csa_projet_java.model.Enseignant;
import com.example.csa_projet_java.model.Etudiant;
import com.example.csa_projet_java.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {
    @Autowired
    private EnseignantRepository enseignantRepository;

    public List<Enseignant> getAllUsers() {
        return enseignantRepository.findAll();
    }
    public Optional<Enseignant> getUserById(Integer id) {
        return enseignantRepository.findById(id);
    }

    public Enseignant createUser(Enseignant user) {
        return enseignantRepository.save(user);
    }



    public void deleteUser(Integer id) {
        enseignantRepository.deleteById(id);
    }
}
