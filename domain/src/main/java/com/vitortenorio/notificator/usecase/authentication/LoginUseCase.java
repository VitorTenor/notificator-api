package com.vitortenorio.notificator.usecase.authentication;

import com.vitortenorio.notificator.entity.authentication.LoginEntity;
import com.vitortenorio.notificator.entity.authentication.AuthenticationEntity;
import com.vitortenorio.notificator.gateway.AuthenticationGateway;

import javax.inject.Named;

@Named
public class LoginUseCase {
    private final AuthenticationGateway authenticationGateway;

    public LoginUseCase(AuthenticationGateway authenticationGateway) {
        this.authenticationGateway = authenticationGateway;
    }

    public AuthenticationEntity execute(LoginEntity loginEntity) {
        return authenticationGateway.login(loginEntity);
    }
}
