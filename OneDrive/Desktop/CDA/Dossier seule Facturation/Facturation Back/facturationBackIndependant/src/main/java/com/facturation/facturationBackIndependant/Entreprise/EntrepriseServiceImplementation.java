package com.facturation.facturationBackIndependant.Entreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseServiceImplementation implements EntrepriseService {

    private final EntrepriseRepository entrepriseRepository;
    @Autowired
    public EntrepriseServiceImplementation(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public Entreprise createEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> findAll() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Optional<Entreprise> findById(Long id) {
        return Optional.ofNullable(entrepriseRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @Override
    public Entreprise save(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void deleteById(Long id) {
        entrepriseRepository.deleteById(id);
    }

    @Override
    public Entreprise updateEntreprise(@PathVariable Long id, @RequestBody Entreprise entreprise) {
        Optional<Entreprise> optionalEntreprise = entrepriseRepository.findById(id);
        if(optionalEntreprise.isPresent()){
            Entreprise existeEntreprise = optionalEntreprise.get();
            existeEntreprise.setId(entreprise.getId());
            existeEntreprise.setSiret(entreprise.getSiret());
            existeEntreprise.setSiren(entreprise.getSiren());
            existeEntreprise.setApe(entreprise.getApe());
            existeEntreprise.setTva(entreprise.getTva());
            existeEntreprise.setAdresse(entreprise.getAdresse());
            existeEntreprise.setCodePostal(entreprise.getCodePostal());
            existeEntreprise.setCommune(entreprise.getCommune());
            existeEntreprise.setPortable(entreprise.getPortable());
            existeEntreprise.setRaisonSocial(entreprise.getRaisonSocial());
            existeEntreprise.setSiege(entreprise.getSiege());
            existeEntreprise.setRcs(entreprise.getRcs());
            existeEntreprise.setCfe(entreprise.getCfe());
            existeEntreprise.setCodeActivite(entreprise.getCodeActivite());
            existeEntreprise.setMail(entreprise.getMail());
            existeEntreprise.setSite(entreprise.getSite());
            existeEntreprise.setNote(entreprise.getNote());
            return entrepriseRepository.save(existeEntreprise);
        }
        return entreprise;
    }
}
