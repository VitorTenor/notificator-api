package com.vitortenorio.notificator.gateway;


import com.vitortenorio.notificator.entity.user.UserRequest;

public interface UserGateway {

    String register(UserRequest userRequest);
}
