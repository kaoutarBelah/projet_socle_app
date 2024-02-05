package com.example.csa_projet_java.service;

import com.example.csa_projet_java.model.Formation;
import com.example.csa_projet_java.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    @Autowired
    private FormationRepository formationRepository;
    public List<Formation> getAllUsers() {
        return formationRepository.findAll();
    }

    public Optional<Formation> getUserById(String id) {
        return formationRepository.findById(id);
    }

    public Formation createUser(Formation formation) {
        return formationRepository.save(formation);
    }

    public void deleteUser(String id) {
        formationRepository.deleteById(id);
    }


}
