package com.esisba.msscolarite.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;

    @Temporal(TemporalType.DATE)
    private Date dateN;

    private String promo;

    @Temporal(TemporalType.DATE)
    private Date dateInsctiption;

    @ManyToOne Etablissement etablissement;
}

