package com.mercadona.BackendPromotionProduits.repository;

import com.mercadona.BackendPromotionProduits.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
