package com.vitortenorio.notificator.gateway;

import com.vitortenorio.notificator.entity.authentication.AuthenticationRequest;
import com.vitortenorio.notificator.entity.authentication.AuthenticationResponse;

public interface AuthenticationGateway {

    AuthenticationResponse login(AuthenticationRequest authenticationRequest);

}
