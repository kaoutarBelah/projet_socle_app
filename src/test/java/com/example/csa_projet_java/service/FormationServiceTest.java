package com.example.csa_projet_java.service;

import com.example.csa_projet_java.model.Formation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FormationServiceTest {
    @Autowired
    FormationService formationService;

    @Test
    public void shouldSaveFormation() throws ParseException {
        // Create a new Formation for the test
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Formation formation = new Formation();
        formation.setCodeFormation("M2DOSI");
        formation.setDiplome("M");
        formation.setNoAnnee(2);
        formation.setNomFormation("Master Développement à l'Offshore des Systèmes d'Information");
        formation.setDoubleDiplome("O");
        formation.setDebutHabilitation(dateFormat.parse("2012-09-01"));
        formation.setFinHabilitation(dateFormat.parse("2016-09-01"));
        // Initialize other properties of Formation as needed

        // Save the Formation using the service
        Formation savedFormation = formationService.createUser(formation);

        // Verify that the saved Formation is not null
        assertNotNull(savedFormation.getCodeFormation());

        // Verify other properties of the saved Formation if necessary
        assertEquals("M2DOSI", savedFormation.getCodeFormation());
        assertEquals("M", savedFormation.getDiplome());
        assertEquals(2, savedFormation.getNoAnnee());
        // Verify other properties of the saved Formation as needed
    }
}