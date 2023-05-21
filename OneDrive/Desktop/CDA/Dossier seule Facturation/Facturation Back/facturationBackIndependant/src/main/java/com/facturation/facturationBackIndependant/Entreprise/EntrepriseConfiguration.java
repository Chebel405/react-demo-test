package com.facturation.facturationBackIndependant.Entreprise;

import com.facturation.facturationBackIndependant.Utilisateur.UtilisateurServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class EntrepriseConfiguration {
    @Bean
    public EntrepriseService entrepriseService(EntrepriseRepository entrepriseRepository){
        return new EntrepriseServiceImplementation(entrepriseRepository);
    }

}
