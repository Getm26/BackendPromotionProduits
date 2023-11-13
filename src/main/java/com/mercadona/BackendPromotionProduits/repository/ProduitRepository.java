package com.mercadona.BackendPromotionProduits.repository;

import com.mercadona.BackendPromotionProduits.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
