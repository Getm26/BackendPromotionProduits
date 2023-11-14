package com.mercadona.BackendPromotionProduits.controller;

import com.mercadona.BackendPromotionProduits.model.Categorie;
import com.mercadona.BackendPromotionProduits.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8092")
@RestController
@RequestMapping("/mercadona")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;


    @GetMapping("/categories/list")
    public List<Categorie> getAllCategorie(){
        return categorieService.afficherCategorie();
    }
    @PostMapping(value = "/categories/new")
    public Categorie createCategorie(@RequestBody Categorie categorie){
        return categorieService.creerCategorie(categorie);
    }
}
