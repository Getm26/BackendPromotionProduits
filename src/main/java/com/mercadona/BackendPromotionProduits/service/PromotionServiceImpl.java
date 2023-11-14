package com.mercadona.BackendPromotionProduits.service;
import com.mercadona.BackendPromotionProduits.model.Promotion;
import com.mercadona.BackendPromotionProduits.repository.PromotionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public abstract class PromotionServiceImpl implements PromotionService {

    private final PromotionRepository promotionRepository;

    @Override
    public Promotion creer(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public List<Promotion> lire() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion modifier(Long id, Promotion promotion) {
        return promotionRepository.findById(id)
                .map(p ->{
                    p.setPrixRemise(promotion.getPrixRemise());
                    p.setDateDebut(promotion.getDateDebut());
                    p.setDateFin(promotion.getDateFin());
                    return promotionRepository.save(promotion);
                }).orElseThrow();

    }
    @Override
    public String supprimer(Long id) {
        promotionRepository.deleteById(id);
        return "La Promotion est Supprimée";
    }

}
