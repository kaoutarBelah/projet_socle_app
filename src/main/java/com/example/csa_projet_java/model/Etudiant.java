package com.example.csa_projet_java.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ETUDIANT")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NO_ETUDIANT_NAT", length = 50, nullable = false)
    private String noEtudiantNat;

    @Column(name = "ANNEE_PRO", length = 10, nullable = false)
    private String anneePro;

    @Column(name = "CODE_COM", length = 10)
    private String codeCom;

    @Column(name = "NO_ETUDIANT_UBO", length = 20)
    private String noEtudiantUbo;


    @Column(name = "NOM", length = 50, nullable = false)
    private String nom;

    @Column(name = "PRENOM", length = 50, nullable = false)
    private String prenom;

    @Column(name = "DATE_NAISSANCE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Column(name = "LIEU_NAISSANCE", length = 255, nullable = false)
    private String lieuNaissance;

    @Column(name = "NATIONALITE", length = 50, nullable = false)
    private String nationalite;

    @Column(name = "TEL_PORT", length = 20)
    private String telPort;

    @Column(name = "TEL_FIXE", length = 20)
    private String telFixe;

    @Column(name = "EMAIL", length = 255)
    private String email;

    @Column(name = "ACTU_ADRESSE", length = 255)
    private String actuAdresse;

    @Column(name = "ACTU_CP", length = 10)
    private String actuCp;

    @Column(name = "ACTU_VILLE", length = 255)
    private String actuVille;

    @Column(name = "ACTU_PAYS", length = 255)
    private String actuPays;

    @Column(name = "PERM_ADRESSE", length = 255, nullable = false)
    private String permAdresse;

    @Column(name = "PERM_CP", length = 10, nullable = false)
    private String permCp;

    @Column(name = "PERM_VILLE", length = 255, nullable = false)
    private String permVille;

    @Column(name = "PERM_PAYS", length = 255, nullable = false)
    private String permPays;

    @Column(name = "DERNIER_DIPLOME", length = 255, nullable = false)
    private String dernierDiplome;

    @Column(name = "UNIVERSITE", length = 255, nullable = false)
    private String universite;

    @Column(name = "SIGLE_ETU", length = 3, nullable = false)
    private String sigleEtu;

    @Column(name = "COMPTE_CRI", length = 10, nullable = false)
    private String compteCri;

    @Column(name = "UBO_EMAIL", length = 255)
    private String uboEmail;

    @Column(name = "GRPE_ANGLAIS")
    private Integer grpeAnglais;

    @Column(name = "ABANDON_MOTIF", length = 255)
    private String abandonMotif;

    @Column(name = "ABANDON_DATE")
    @Temporal(TemporalType.DATE)
    private Date abandonDate;

    @Column(name = "EST_DIPLOME", length = 1)
    private String estDiplome;

    // Foreign key constraint for ANNEE_PRO
    @ManyToOne
    @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "ANNEE_PRO", insertable = false, updatable = false)
    private Promotion promotion;

    // Check constraints
    @Check(constraints = "SITUATION IN ('CEL', 'MAR', 'VEU', 'DIV')")
    @Column(name = "SITUATION", length = 3, nullable = false)
    private String situation;

    @Check(constraints = "SEXE IN ('H', 'F', 'L')")
    @Column(name = "SEXE", length = 1, nullable = false)
    private String sexe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public String getCodeCom() {
        return codeCom;
    }

    public void setCodeCom(String codeCom) {
        this.codeCom = codeCom;
    }

    public String getNoEtudiantUbo() {
        return noEtudiantUbo;
    }

    public void setNoEtudiantUbo(String noEtudiantUbo) {
        this.noEtudiantUbo = noEtudiantUbo;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActuAdresse() {
        return actuAdresse;
    }

    public void setActuAdresse(String actuAdresse) {
        this.actuAdresse = actuAdresse;
    }

    public String getActuCp() {
        return actuCp;
    }

    public void setActuCp(String actuCp) {
        this.actuCp = actuCp;
    }

    public String getActuVille() {
        return actuVille;
    }

    public void setActuVille(String actuVille) {
        this.actuVille = actuVille;
    }

    public String getActuPays() {
        return actuPays;
    }

    public void setActuPays(String actuPays) {
        this.actuPays = actuPays;
    }

    public String getPermAdresse() {
        return permAdresse;
    }

    public void setPermAdresse(String permAdresse) {
        this.permAdresse = permAdresse;
    }

    public String getPermCp() {
        return permCp;
    }

    public void setPermCp(String permCp) {
        this.permCp = permCp;
    }

    public String getPermVille() {
        return permVille;
    }

    public void setPermVille(String permVille) {
        this.permVille = permVille;
    }

    public String getPermPays() {
        return permPays;
    }

    public void setPermPays(String permPays) {
        this.permPays = permPays;
    }

    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getSigleEtu() {
        return sigleEtu;
    }

    public void setSigleEtu(String sigleEtu) {
        this.sigleEtu = sigleEtu;
    }

    public String getCompteCri() {
        return compteCri;
    }

    public void setCompteCri(String compteCri) {
        this.compteCri = compteCri;
    }

    public String getUboEmail() {
        return uboEmail;
    }

    public void setUboEmail(String uboEmail) {
        this.uboEmail = uboEmail;
    }

    public Integer getGrpeAnglais() {
        return grpeAnglais;
    }

    public void setGrpeAnglais(Integer grpeAnglais) {
        this.grpeAnglais = grpeAnglais;
    }

    public String getAbandonMotif() {
        return abandonMotif;
    }

    public void setAbandonMotif(String abandonMotif) {
        this.abandonMotif = abandonMotif;
    }

    public Date getAbandonDate() {
        return abandonDate;
    }

    public void setAbandonDate(Date abandonDate) {
        this.abandonDate = abandonDate;
    }

    public String getEstDiplome() {
        return estDiplome;
    }

    public void setEstDiplome(String estDiplome) {
        this.estDiplome = estDiplome;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}
