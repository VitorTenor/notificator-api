package com.vitortenorio.notificator.api.v1.input;

import com.vitortenorio.notificator.entity.authentication.LoginEntity;

public record LoginInput(
        String login,
        String password
){
    public LoginEntity toEntity(){
        return new LoginEntity(
                this.login,
                this.password
        );
    }
}
