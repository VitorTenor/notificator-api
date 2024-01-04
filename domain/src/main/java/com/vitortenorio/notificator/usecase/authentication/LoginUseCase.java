package com.vitortenorio.notificator.usecase.authentication;

import com.vitortenorio.notificator.entity.authentication.AuthenticationRequest;
import com.vitortenorio.notificator.entity.authentication.AuthenticationResponse;
import com.vitortenorio.notificator.gateway.AuthenticationGateway;

import javax.inject.Named;

@Named
public class LoginUseCase {
    private final AuthenticationGateway authenticationGateway;

    public LoginUseCase(AuthenticationGateway authenticationGateway) {
        this.authenticationGateway = authenticationGateway;
    }

    public AuthenticationResponse execute(AuthenticationRequest authenticationRequest) {
        return authenticationGateway.login(authenticationRequest);
    }
}
