package com.diabeteAngular.repository;

import com.diabeteAngular.model.Glycemie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlycemieRepository extends JpaRepository<Glycemie, Integer> {
}
