package com.facturation.facturationBackIndependant.Utilisateur;

import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;

@ComponentScan
public interface UtilisateurService {
    Utilisateur createUtilisateur(Utilisateur utilisateur);

    List<Utilisateur> findAll();

    Optional<Utilisateur> findById(Long id);

    Utilisateur save(Utilisateur utilisateur);

    void deleteById(Long id);

    Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur);
}
