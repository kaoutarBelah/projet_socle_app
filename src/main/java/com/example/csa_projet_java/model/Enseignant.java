package com.example.csa_projet_java.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ENSEIGNANT")
public class Enseignant {
    @Id
    @Column(name = "NO_ENSEIGNANT", nullable = false)
    private Integer noEnseignant;

    @Column(name = "NOM", length = 50, nullable = false)
    private String nom;

    @Column(name = "PRENOM", length = 50, nullable = false)
    private String prenom;

    @OneToMany(mappedBy = "enseignant", cascade = CascadeType.ALL)
    private List<Promotion> promotions;


    @Column(name = "ADRESSE", length = 255, nullable = false)
    private String adresse;

    @Column(name = "CP", length = 10, nullable = false)
    private String cp;

    @Column(name = "VILLE", length = 255, nullable = false)
    private String ville;

    @Column(name = "PAYS", length = 255, nullable = false)
    private String pays;

    @Column(name = "TEL_PORT", length = 20)
    private String telPort;

    @Column(name = "ENC_PERSO_TEL", length = 20)
    private String encPersoTel;

    @Column(name = "ENC_UBO_TEL", length = 20)
    private String encUboTel;

    @Column(name = "ENC_PERSO_EMAIL", length = 255)
    private String encPersoEmail;

    @Column(name = "ENC_UBO_EMAIL", length = 255)
    private String encUboEmail;

    @Column(name = "INT_NO_INSEE", length = 50)
    private String intNoInsee;

    @Column(name = "INT_SOC_NOM", length = 50)
    private String intSocNom;

    @Column(name = "INT_SOC_ADRESSE", length = 255)
    private String intSocAdresse;

    @Column(name = "INT_SOC_CP", length = 10)
    private String intSocCp;

    @Column(name = "INT_SOC_VILLE", length = 255)
    private String intSocVille;

    @Column(name = "INT_SOC_PAYS", length = 255)
    private String intSocPays;

    @Column(name = "INT_FONCTION", length = 50)
    private String intFonction;

    @Column(name = "INT_PROF_EMAIL", length = 255)
    private String intProfEmail;

    @Column(name = "INT_PROF_TEL", length = 20)
    private String intProfTel;

    // Check constraint for SEXE
    @Check(constraints = "SEXE IN ('H', 'F', 'L')")
    @Column(name = "SEXE", length = 1, nullable = false)
    private String sexe;

    // Check constraint for TYPE
    @Check(constraints = "TYPE IN ('ENC', 'INT')")
    @Column(name = "TYPE", length = 10, nullable = false)
    private String type;

    public Integer getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Integer noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getEncPersoTel() {
        return encPersoTel;
    }

    public void setEncPersoTel(String encPersoTel) {
        this.encPersoTel = encPersoTel;
    }

    public String getEncUboTel() {
        return encUboTel;
    }

    public void setEncUboTel(String encUboTel) {
        this.encUboTel = encUboTel;
    }

    public String getEncPersoEmail() {
        return encPersoEmail;
    }

    public void setEncPersoEmail(String encPersoEmail) {
        this.encPersoEmail = encPersoEmail;
    }

    public String getEncUboEmail() {
        return encUboEmail;
    }

    public void setEncUboEmail(String encUboEmail) {
        this.encUboEmail = encUboEmail;
    }

    public String getIntNoInsee() {
        return intNoInsee;
    }

    public void setIntNoInsee(String intNoInsee) {
        this.intNoInsee = intNoInsee;
    }

    public String getIntSocNom() {
        return intSocNom;
    }

    public void setIntSocNom(String intSocNom) {
        this.intSocNom = intSocNom;
    }

    public String getIntSocAdresse() {
        return intSocAdresse;
    }

    public void setIntSocAdresse(String intSocAdresse) {
        this.intSocAdresse = intSocAdresse;
    }

    public String getIntSocCp() {
        return intSocCp;
    }

    public void setIntSocCp(String intSocCp) {
        this.intSocCp = intSocCp;
    }

    public String getIntSocVille() {
        return intSocVille;
    }

    public void setIntSocVille(String intSocVille) {
        this.intSocVille = intSocVille;
    }

    public String getIntSocPays() {
        return intSocPays;
    }

    public void setIntSocPays(String intSocPays) {
        this.intSocPays = intSocPays;
    }

    public String getIntFonction() {
        return intFonction;
    }

    public void setIntFonction(String intFonction) {
        this.intFonction = intFonction;
    }

    public String getIntProfEmail() {
        return intProfEmail;
    }

    public void setIntProfEmail(String intProfEmail) {
        this.intProfEmail = intProfEmail;
    }

    public String getIntProfTel() {
        return intProfTel;
    }

    public void setIntProfTel(String intProfTel) {
        this.intProfTel = intProfTel;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
