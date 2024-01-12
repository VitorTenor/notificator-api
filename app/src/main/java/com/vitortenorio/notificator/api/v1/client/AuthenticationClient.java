package com.vitortenorio.notificator.api.v1.client;

import com.vitortenorio.notificator.api.v1.repository.AuthenticationUserRepository;
import com.vitortenorio.notificator.core.security.service.TokenService;
import com.vitortenorio.notificator.entity.authentication.LoginEntity;
import com.vitortenorio.notificator.entity.authentication.AuthenticationEntity;
import com.vitortenorio.notificator.gateway.AuthenticationGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthenticationClient implements AuthenticationGateway {

    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;
    private final AuthenticationUserRepository authenticationUserRepository;

    @Override
    public AuthenticationEntity login(LoginEntity user) {
        final var usernamePassword = new UsernamePasswordAuthenticationToken(user.login(), user.password());

        authenticationManager.authenticate(usernamePassword);

        final var userModel = authenticationUserRepository.findByLogin(user.login());

        return new AuthenticationEntity(
                tokenService.generateToken(userModel),
                tokenService.generateToken(userModel)
        );
    }
}
