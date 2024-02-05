package com.example.csa_projet_java.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FORMATION")
public class Formation {

    @Id
    @Column(name = "CODE_FORMATION", length = 8, nullable = false)
    private String codeFormation;

    @Column(name = "DIPLOME", length = 3, nullable = false)
    private String diplome;

    @Check(constraints = "NO_ANNEE BETWEEN 1 AND 3")
    @Column(name = "NO_ANNEE", nullable = false)
    private Integer noAnnee;

    @Column(name = "NOM_FORMATION", length = 64, nullable = false)
    private String nomFormation;

    @Column(name = "DOUBLE_DIPLOME", length = 1, nullable = false)
    private String doubleDiplome;

    @Column(name = "DEBUT_HABILITATION")
    @Temporal(TemporalType.DATE)
    private Date debutHabilitation;

    @OneToMany(mappedBy = "formation", cascade = CascadeType.ALL)
    private List<Promotion> promotions;

    @Column(name = "FIN_HABILITATION")
    @Temporal(TemporalType.DATE)
    private Date finHabilitation;

    // Constructors, getters, setters, and other methods as needed

}
