package com.vitortenorio.notificator.gateway;

import com.vitortenorio.notificator.entity.authentication.LoginEntity;
import com.vitortenorio.notificator.entity.authentication.AuthenticationEntity;

public interface AuthenticationGateway {

    AuthenticationEntity login(LoginEntity loginEntity);

}
