package com.vitortenorio.notificator.api.v1.input;

import com.vitortenorio.notificator.entity.user.UserRegisterEntity;

public record UserRegisterInput (
        String username,
        String email,
        String password
) {
    public UserRegisterEntity toEntity(){
        return new UserRegisterEntity(
                this.username,
                this.email,
                this.password
        );
    }
}
