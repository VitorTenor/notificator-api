package com.vitortenorio.notificator.entity.user;

public record UserRequest (
    String username,
    String email,
    String password
) {
}
