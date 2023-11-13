package com.mercadona.BackendPromotionProduits.repository;

import com.mercadona.BackendPromotionProduits.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
