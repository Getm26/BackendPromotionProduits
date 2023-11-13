package com.mercadona.BackendPromotionProduits.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
    @Setter
    @NoArgsConstructor
    @Entity
    @Table(name = "UTILISATEURS")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToMany
        @JoinTable(name = "user_role",
          joinColumns = @JoinColumn(name = "idUser"),
                inverseJoinColumns = @JoinColumn(name = "idRole")
        )
        private List<Role> roles = new ArrayList<>();


        @Column(name = "USERNAME")
        private String username;
        @Column(name = "PASSWORD")
        private String password;
    }

