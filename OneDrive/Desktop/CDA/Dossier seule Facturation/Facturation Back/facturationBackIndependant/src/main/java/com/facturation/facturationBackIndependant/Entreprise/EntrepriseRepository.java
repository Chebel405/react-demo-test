package com.facturation.facturationBackIndependant.Entreprise;

import com.facturation.facturationBackIndependant.Utilisateur.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
