package com.mercadona.BackendPromotionProduits.controller;

import com.mercadona.BackendPromotionProduits.model.Promotion;
import com.mercadona.BackendPromotionProduits.service.PromotionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8092")
@RestController
@RequestMapping("/mercadona")
@AllArgsConstructor
public class PromotionController {

    @Autowired
    private final PromotionService promotionService;


    @GetMapping("/promotions/list")
    public List<Promotion> getAllPromotions(){
        return promotionService.lirePromotion();
    }


    @PostMapping(value="/promotions/add")

    public Promotion createPromotion(@RequestBody Promotion promotion){
        return promotionService.creerPromotion(promotion);
    }

    @PutMapping("/promomotions/update/{id}")
    public Promotion update(@PathVariable Long id, @RequestBody Promotion promotion){
        return promotionService.modifierPromotion(id, promotion);
    }

    @DeleteMapping("/promomotions/delete")
    public  String delete(@PathVariable Long id){
        return promotionService.supprimerPromotion(id);

    }

}