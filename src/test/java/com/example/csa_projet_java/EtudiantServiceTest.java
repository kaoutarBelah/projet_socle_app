package com.example.csa_projet_java;

import com.example.csa_projet_java.model.Etudiant;
import com.example.csa_projet_java.repository.EtudiantRepository;
import com.example.csa_projet_java.service.EtudiantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest

public class EtudiantServiceTest {

    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Test
    public void testCreateUser() {
        Etudiant etudiant = new Etudiant();
        etudiant.setNoEtudiantNat("6589RS236F");
        etudiant.setAnneePro("2004-2005");
        etudiant.setCodeCom("CILI3.2");
        etudiant.setNoEtudiantUbo("200056312");
        etudiant.setSexe("F");
        etudiant.setNom("Arnaldi");
        etudiant.setPrenom("Solenn");
        etudiant.setDateNaissance(new Date(1980, 3, 19));
        etudiant.setLieuNaissance("Guingamp");
        etudiant.setSituation("CEL");
        etudiant.setNationalite("Française");
        etudiant.setTelPort("06.88.55.78.97");
        etudiant.setTelFixe(null); // Assuming null for the given value
        etudiant.setEmail("solenn.arnaldi@wanadoo.fr");
        etudiant.setActuAdresse("17 rue Laënnec");
        etudiant.setActuCp("29200");
        etudiant.setActuVille("Brest");
        etudiant.setActuPays("France");
        etudiant.setPermAdresse("17 rue Laënnec");
        etudiant.setPermCp("29200");
        etudiant.setPermVille("Brest");
        etudiant.setPermPays("France");
        etudiant.setDernierDiplome("Master1 Informatique");
        etudiant.setUniversite("UBO Brest");
        etudiant.setSigleEtu("SOA");
        etudiant.setCompteCri("arnaldso");
        etudiant.setUboEmail(null); // Assuming null for the given value
        etudiant.setGrpeAnglais(null); // Assuming null for the given value
        etudiant.setAbandonMotif(null); // Assuming null for the given value
        etudiant.setAbandonDate(null); // Assuming null for the given value
        etudiant.setEstDiplome("O");


        Etudiant savedEtudiant = etudiantRepository.save(etudiant);
        //Etudiant e =etudiantRepository.findById();

        assertThat(savedEtudiant).isNotNull();
        assertThat(savedEtudiant.getId()).isNotNull();
        assertThat(savedEtudiant.getNoEtudiantNat()).isEqualTo("6589RS236F");
    }
}
