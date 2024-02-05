package com.example.csa_projet_java.repository;

import com.example.csa_projet_java.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
