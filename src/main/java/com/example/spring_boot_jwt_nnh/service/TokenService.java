package com.example.spring_boot_jwt_nnh.service;

import com.example.spring_boot_jwt_nnh.entity.Token;

public interface TokenService {
	Token createToken(Token token);
	
}
