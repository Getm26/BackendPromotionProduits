package com.mercadona.BackendPromotionProduits.service;

import com.mercadona.BackendPromotionProduits.model.Categorie;
import com.mercadona.BackendPromotionProduits.repository.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieServiceImpl implements CategorieService{

    private CategorieRepository categorieRepository;

    @Override
    public Categorie creerCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }
    @Override
    public List<Categorie> afficherCategorie() {
        return categorieRepository.findAll();
    }
    @Override
    public Categorie modifierCategorie(Long id, Categorie categorie) {
        return categorieRepository.findById(id)
                .map(c ->{
                    c.setLibelleCategorie(categorie.getLibelleCategorie());
                    c.setCategories(categorie.getCategories());
                    return categorieRepository.save(categorie);
                }).orElseThrow();
    }
    @Override
    public String supprimerCategorie(Long id) {
        categorieRepository.deleteById(id);
        return "le catégorie est  Supprimé";
    }




}
