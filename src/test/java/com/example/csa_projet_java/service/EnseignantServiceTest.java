package com.example.csa_projet_java.service;

import com.example.csa_projet_java.model.Enseignant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnseignantServiceTest {
    @Autowired
    EnseignantService enseignantService;

    @Test
    public void shouldSaveEnseignant() {
        Enseignant enseignant = new Enseignant();
        enseignant.setNoEnseignant(123);
        enseignant.setNom("Doe");
        enseignant.setPrenom("John");
        enseignant.setAdresse("123 Rue Example");
        enseignant.setCp("12345");
        enseignant.setVille("Ville Example");
        enseignant.setPays("Pays Example");
        enseignant.setTelPort("1234567890");
        enseignant.setEncPersoTel("0987654321");
        enseignant.setEncUboTel("9876543210");
        enseignant.setEncPersoEmail("john.doe@example.com");
        enseignant.setEncUboEmail("john.doe@ubo.fr");
        enseignant.setIntNoInsee("1234567890123");
        enseignant.setIntSocNom("Société Example");
        enseignant.setIntSocAdresse("456 Rue de la Société");
        enseignant.setIntSocCp("54321");
        enseignant.setIntSocVille("Autre Ville");
        enseignant.setIntSocPays("Autre Pays");
        enseignant.setIntFonction("Fonction Example");
        enseignant.setIntProfEmail("john.doe@prof.example.com");
        enseignant.setIntProfTel("1357902468");
        enseignant.setSexe("H");
        enseignant.setType("ENC");
        // Initialisez d'autres propriétés de l'enseignant selon vos besoins

        // Enregistre l'enseignant en utilisant le service
        Enseignant savedEnseignant = enseignantService.createUser(enseignant);

        // Vérifie que l'enseignant enregistré n'est pas null
        assertNotNull(savedEnseignant.getNoEnseignant());

        // Vérifiez d'autres propriétés de l'enseignant enregistré si nécessaire
        assertEquals(123, savedEnseignant.getNoEnseignant());
        assertEquals("Doe", savedEnseignant.getNom());
        assertEquals("John", savedEnseignant.getPrenom());
        // Vérifiez d'autres propriétés de l'enseignant enregistré selon vos besoins
    }

}