package com.facturation.facturationBackIndependant.Utilisateur;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "utilisateur")
@Data
@Getter
@Setter
public class Utilisateur {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonProperty("nom")
    private String nom;

    @JsonProperty("prenom")
    private String prenom;

    @JsonProperty("fonction")
    private String fonction;
    @JsonProperty("role")
    private String role;
    @JsonProperty("portable")
    private String portable;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("societe")
    private String societe;
    @JsonProperty("code_activite")
    private String codeActivite;
    @JsonProperty("adresse")
    private String adresse;
    @JsonProperty("code_postal")
    private String codePostal;
    @JsonProperty("ville")
    private String ville;
    @JsonProperty("note")
    private String note;

}
