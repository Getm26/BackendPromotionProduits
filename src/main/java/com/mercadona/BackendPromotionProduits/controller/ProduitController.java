package com.mercadona.BackendPromotionProduits.controller;

import com.mercadona.BackendPromotionProduits.model.Produit;
import com.mercadona.BackendPromotionProduits.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8092")
@RequestMapping("/mercadona")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping("/produits/add")
    public Produit create(@RequestBody Produit produit){
        return produitService.creer(produit);
    }

    @GetMapping("/produits/list")
    public List<Produit> read(){
        return produitService.lire();
    }

    @PutMapping("/produits/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id,produit);
    }

    @DeleteMapping("produits/delete")
    public  String delete(@PathVariable Long id){
        return produitService.supprimer(id);

    }
}
