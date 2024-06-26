package com.diabeteAngular.service;

import com.diabeteAngular.model.Glycemie;
import com.diabeteAngular.repository.GlycemieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlycemieService {

    @Autowired
    GlycemieRepository glycemieRepository;

    public List<Glycemie> getAllGlycemies() {
        return glycemieRepository.findAll();
    }
    public Glycemie getGlycemieById(int id) {
        return glycemieRepository.findById(id).get();
    }
    public Glycemie addGlycemie(Glycemie glycemie) {
        return glycemieRepository.save(glycemie);
    }
    public void deleteGlycemie(Glycemie glycemie) {
        glycemieRepository.delete(glycemie);
    }
    public Glycemie updateGlycemie(Glycemie glycemie) {
        return glycemieRepository.save(glycemie);
    }
}
