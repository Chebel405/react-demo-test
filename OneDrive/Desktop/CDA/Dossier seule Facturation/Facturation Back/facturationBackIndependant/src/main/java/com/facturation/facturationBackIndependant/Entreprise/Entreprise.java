package com.facturation.facturationBackIndependant.Entreprise;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "entreprise")
@Data
@Getter
@Setter

public class Entreprise {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String siret;
    private String siren;
    private String ape;
    private String tva;
    private String adresse;
    private String codePostal;
    private String commune;
    private String portable;
    private String raisonSocial;
    private String siege;
    private String rcs;
    private String cfe;
    private String codeActivite;
    private String mail;
    private String site;
    private String note;




}
