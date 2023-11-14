package com.mercadona.BackendPromotionProduits.controller;

import com.mercadona.BackendPromotionProduits.model.Promotion;
import com.mercadona.BackendPromotionProduits.repository.CategorieRepository;

import com.mercadona.BackendPromotionProduits.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8092")
@RestController
@RequestMapping("/mercadona")
public class CategorieController {

    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private PromotionRepository promotionRepository;

    @GetMapping("/promotions")
    public List<Promotion> getAllPromotions(){
        return promotionRepository.findAll();
    }
    @PostMapping(value = "/promotions")
    public Promotion createPromotion(@RequestBody Promotion promotion){
        return promotionRepository.save(promotion);
    }
}
