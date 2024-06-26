package com.diabeteAngular.controller;


import com.diabeteAngular.model.Glycemie;
import com.diabeteAngular.service.GlycemieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GlycemieController {

    @Autowired
    GlycemieService glycemieService;

    @GetMapping("/All")
    public List<Glycemie> getGlycemies() {
        return glycemieService.getAllGlycemies();
    }

    @PostMapping("/save")
    public String AddGlycemie(@RequestBody Glycemie glycemie) {
        glycemieService.addGlycemie(glycemie);
        return "Saved ...";
    }

    @PutMapping("/update/{id}")
    public String updateGlycemie(@PathVariable Integer id,@RequestBody Glycemie glycemie) {
        Glycemie updatedGlycemie = glycemieService.getGlycemieById(id);
        updatedGlycemie.setDate(glycemie.getDate());
        updatedGlycemie.setLevel(glycemie.getLevel());
        glycemieService.updateGlycemie(updatedGlycemie);
        return "Updated ...";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGlycemie(@PathVariable Integer id) {
        Glycemie deletelycemie=glycemieService.getGlycemieById(id);
        glycemieService.deleteGlycemie(deletelycemie);
        return "Delete the Glycemie with id: "+id;
    }
}
