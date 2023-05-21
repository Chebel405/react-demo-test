package com.facturation.facturationBackIndependant.Entreprise;

import com.facturation.facturationBackIndependant.Utilisateur.Utilisateur;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;

@ComponentScan
public interface EntrepriseService {
    Entreprise createEntreprise(Entreprise entreprise);

    List<Entreprise> findAll();

    Optional<Entreprise> findById(Long id);

    Entreprise save(Entreprise entreprise);

    void deleteById(Long id);

    Entreprise updateEntreprise(Long id, Entreprise entreprise);
}
