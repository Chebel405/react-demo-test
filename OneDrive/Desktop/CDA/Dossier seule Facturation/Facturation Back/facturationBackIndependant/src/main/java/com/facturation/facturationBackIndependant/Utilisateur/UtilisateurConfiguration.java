package com.facturation.facturationBackIndependant.Utilisateur;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class UtilisateurConfiguration {
    @Bean
    public UtilisateurService utilisateurService(UtilisateurRepository utilisateurRepository) {
        return new UtilisateurServiceImplementation(utilisateurRepository);
    }
}
