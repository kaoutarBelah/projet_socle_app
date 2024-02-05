package com.example.csa_projet_java.service;
import com.example.csa_projet_java.model.Promotion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PromotionServiceTest {
    @Autowired
    PromotionService promotionService;

    @Test
    public void shouldSaveFormation() {
        Promotion promotion = new Promotion();
        promotion.setAnneePro("2004-2005");
        //promotion.setEtudiants(Arrays.asList(new Etudiant()));
        //promotion.setEnseignant(enseignantRepository.findEnseignantByNoEnseignant(1));
        //promotion.setFormation(formationRepository.findFormationByCodeFormation("CODE1234"));
        promotion.setSiglePro("INF");
        promotion.setNbEtuSouhaite(50);
        promotion.setEtatPreselection("ENC");
        promotion.setDateRentree(new Date());
        promotion.setLieuRentree("Campus");
        promotion.setDateReponseLp(new Date());
        promotion.setCommentaire("Comment");
        promotion.setDateReponseLalp(new Date());
        promotion.setProcessusStage("12345");
        promotion.setNoEvaluation(1);
        promotion.setNoBareme(1);


        //promotionRepository.save(promotion);
        Promotion insertedPromotion = promotionService.createUser(promotion);

        //Promotion insertedPromotion = promotionRepository.findPromotionByAnneePro("2004-2005");

        assertNotNull(insertedPromotion);
        assertEquals("2004-2005", insertedPromotion.getAnneePro());
        assertEquals("INF", insertedPromotion.getSiglePro());
        assertEquals(Integer.valueOf(50), insertedPromotion.getNbEtuSouhaite());
        assertEquals("ENC", insertedPromotion.getEtatPreselection());
        assertNotNull(insertedPromotion.getDateRentree());
        assertEquals("Campus", insertedPromotion.getLieuRentree());
        assertNotNull(insertedPromotion.getDateReponseLp());
        assertEquals("Comment", insertedPromotion.getCommentaire());
        assertNotNull(insertedPromotion.getDateReponseLalp());
        assertEquals("12345", insertedPromotion.getProcessusStage());
        assertEquals(Integer.valueOf(1), insertedPromotion.getNoEvaluation());
        assertEquals(Integer.valueOf(1), insertedPromotion.getNoBareme());
    }
}