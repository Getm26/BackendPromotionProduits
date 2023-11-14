package com.mercadona.BackendPromotionProduits.service;

import com.mercadona.BackendPromotionProduits.model.Categorie;

import java.util.List;

public interface CategorieService {
    Categorie creerCategorie(Categorie categorie);

    List<Categorie> afficherCategorie();

    Categorie modifierCategorie(Long id, Categorie categorie);

    String supprimerCategorie(Long id);
}
