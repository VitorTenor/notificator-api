package com.vitortenorio.notificator.api.v1.output;

public record AuthenticationOutput(
        String token,
        String refreshToken
) {
}
