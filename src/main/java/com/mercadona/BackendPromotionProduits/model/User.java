package com.mercadona.BackendPromotionProduits.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @NoArgsConstructor
    @Entity
    @Table(name = "UTILISATEURS")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "USERNAME")
        private String username;
        @Column(name = "PASSWORD")
        private String password;
        @Column(name = "ROLE")
        private String role;

    }

