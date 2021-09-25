package com.example.spring_boot_jwt_nnh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_jwt_nnh.entity.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {
    
}