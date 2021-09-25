package com.example.spring_boot_jwt_nnh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_jwt_nnh.entity.Token;
import com.example.spring_boot_jwt_nnh.repository.TokenRepository;
import com.example.spring_boot_jwt_nnh.service.TokenService;

@Service
public class TokenServiceImpl implements TokenService {

	@Autowired
    private TokenRepository tokenRepository;

    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token) ;
    }

}
