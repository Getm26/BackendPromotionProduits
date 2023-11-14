package com.mercadona.BackendPromotionProduits.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain apiSecurity(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/mercadona/produits").hasAnyRole("ADMIN","USER")
                        .requestMatchers("/mercadona/produits/add").hasAnyRole("ADMIN")
                        .requestMatchers("/mercadona/produits/list").permitAll()
                        .requestMatchers("/mercadona/promotions").hasAnyRole("ADMIN","USER")
                        .requestMatchers("/mercadona/promotions/add").hasAnyRole("ADMIN")
                        .requestMatchers("/mercadona/promotions/list").permitAll()
                        .requestMatchers("/mercadona/categories").hasAnyRole("ADMIN","USER")
                        .requestMatchers("/mercadona/categories/add").hasAnyRole("ADMIN")
                        .requestMatchers("/mercadona/categories/list").permitAll()
                        .anyRequest()
                        .authenticated()
                )
                .httpBasic();
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder().encode("user"))
                .roles("USER")
                .build();
        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
