package com.vitortenorio.notificator.entity.authentication;

public record AuthenticationEntity(
    String token,
    String refreshToken
) {
}
