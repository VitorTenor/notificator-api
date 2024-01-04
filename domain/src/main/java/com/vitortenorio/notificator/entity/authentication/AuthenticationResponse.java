package com.vitortenorio.notificator.entity.authentication;

public record AuthenticationResponse(
    String token,
    String refreshToken
) {
}
