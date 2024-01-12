package com.vitortenorio.notificator.gateway;


import com.vitortenorio.notificator.entity.user.UserRegisterEntity;

public interface UserGateway {

    String register(UserRegisterEntity userRegisterEntity);
}
