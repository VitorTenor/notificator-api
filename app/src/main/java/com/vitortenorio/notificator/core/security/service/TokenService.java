package com.vitortenorio.notificator.core.security.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.vitortenorio.notificator.api.v1.model.AuthenticationUserModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(AuthenticationUserModel user){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            return JWT.create()
                    .withIssuer("auth0")
                    .withSubject(user.getLogin())
                    .withClaim("userUuid", user.getId().toString())
                    .withClaim("userEmail", user.getEmail())
                    .withClaim("userLogin", user.getLogin())
                    .withClaim("userRole", user.getRole().name())
                    .withClaim("userName", user.getUsername())
                    .withExpiresAt(generateExpirationDate())
                    .sign(algorithm);

        } catch (JWTCreationException exception){
            exception.printStackTrace();
            return null;
        }
    }

    public String validateToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (Exception exception){
            return "";
        }
    }

    private Instant generateExpirationDate(){
        return LocalDateTime
                .now().plusHours(2)
                .toInstant(ZoneOffset.of("-03:00"));
    }
}
