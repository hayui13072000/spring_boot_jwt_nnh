package com.example.spring_boot_jwt_nnh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_jwt_nnh.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}