package com.vitortenorio.notificator.usecase.user;

import com.vitortenorio.notificator.entity.user.UserRequest;
import com.vitortenorio.notificator.gateway.UserGateway;

import javax.inject.Named;

@Named
public class RegisterUseCase {
    private final UserGateway userGateway;

    public RegisterUseCase(final UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public void execute(final UserRequest userRequest) {
        this.userGateway.register(userRequest);
    }
}