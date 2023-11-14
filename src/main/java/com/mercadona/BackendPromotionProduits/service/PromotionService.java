package com.mercadona.BackendPromotionProduits.service;

import com.mercadona.BackendPromotionProduits.model.Promotion;

import java.util.List;

public interface PromotionService {
    Promotion creer(Promotion promotion);

    List<Promotion> lire();

    Promotion modifier(Long id, Promotion promotion);

    String supprimer(Long id);
}
