package com.vitortenorio.notificator.entity.user;

public record UserRegisterEntity(
    String username,
    String email,
    String password
) {
}
