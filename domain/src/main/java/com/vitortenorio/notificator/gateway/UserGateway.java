package com.vitortenorio.notificator.gateway;


import com.vitortenorio.notificator.entity.user.UserRequest;

public interface UserGateway {

    void register(UserRequest userRequest);
}
