package com.mercadona.BackendPromotionProduits.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PRODUITS")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name =  "LIBELLE_PRODUIT")
    private String libelleProduit;
    @Column(name = "DESCRIPTION")
    private  String description;
    @Column(name = "PRIX_PRODUIT")
    private Integer prixProduit;
}
