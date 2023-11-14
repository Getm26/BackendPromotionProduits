package com.mercadona.BackendPromotionProduits.service;

import com.mercadona.BackendPromotionProduits.model.Promotion;

import java.util.List;

public interface PromotionService {
    Promotion creerPromotion(Promotion promotion);

    List<Promotion> lirePromotion();

    Promotion modifierPromotion(Long id, Promotion promotion);

    String supprimerPromotion(Long id);
}
