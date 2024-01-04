package com.vitortenorio.notificator.entity.authentication;

public record AuthenticationRequest (
    String login,
    String password
){
}
