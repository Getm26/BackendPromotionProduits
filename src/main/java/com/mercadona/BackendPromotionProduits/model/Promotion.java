package com.mercadona.BackendPromotionProduits.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PROMOTIONS")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "promotion_produit",
            joinColumns = @JoinColumn(name = "idCPromotion"),
            inverseJoinColumns = @JoinColumn(name = "idProduit")
    )
    private List<Promotion> promotions = new ArrayList<>();

    @Column(name = "DATE_DEBUT")
    private Date dateDebut;
    @Column(name = "DATE_FIN")
    private  Date dateFin;
    @Column(name = "PRIX_REMISE")
    private float prixRemise;
}
