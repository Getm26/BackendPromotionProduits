package com.mercadona.BackendPromotionProduits.repository;

import com.mercadona.BackendPromotionProduits.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
