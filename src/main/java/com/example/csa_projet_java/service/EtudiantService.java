package com.example.csa_projet_java.service;

import com.example.csa_projet_java.model.Etudiant;
import com.example.csa_projet_java.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;
    public List<Etudiant> getAllUsers() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> getUserById(Long id) {
        return etudiantRepository.findById(id);
    }

    public Etudiant createUser(Etudiant user) {
        return etudiantRepository.save(user);
    }

    public Etudiant updateUser(Long id, Etudiant userDetails) {
        Optional<Etudiant> userOptional = etudiantRepository.findById(id);
        if (userOptional.isPresent()) {
            Etudiant user = userOptional.get();
            user.setNom(userDetails.getNom());
            user.setPrenom(userDetails.getPrenom());
            return etudiantRepository.save(user);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

    public void deleteUser(Long id) {
        etudiantRepository.deleteById(id);
    }


}
