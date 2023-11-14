package com.mercadona.BackendPromotionProduits.service;
import com.mercadona.BackendPromotionProduits.model.Promotion;
import com.mercadona.BackendPromotionProduits.repository.PromotionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PromotionServiceImpl implements PromotionService {

    private final PromotionRepository promotionRepository;

    @Override
    public Promotion creerPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public List<Promotion> lirePromotion() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion modifierPromotion(Long id, Promotion promotion) {
        return promotionRepository.findById(id)
                .map(pr ->{
                    pr.setPrixRemise(promotion.getPrixRemise());
                    pr.setDateDebut(promotion.getDateDebut());
                    pr.setDateFin(promotion.getDateFin());
                    return promotionRepository.save(promotion);
                }).orElseThrow();

    }
    @Override
    public String supprimerPromotion(Long id) {
        promotionRepository.deleteById(id);
        return "La Promotion est Supprimée";
    }

}
