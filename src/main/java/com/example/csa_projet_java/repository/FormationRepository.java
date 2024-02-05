package com.example.csa_projet_java.repository;

import com.example.csa_projet_java.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, String> {
}
