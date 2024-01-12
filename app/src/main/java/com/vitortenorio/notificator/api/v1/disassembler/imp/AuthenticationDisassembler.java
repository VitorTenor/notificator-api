package com.vitortenorio.notificator.api.v1.disassembler.imp;

import com.vitortenorio.notificator.api.v1.disassembler.Disassembler;
import com.vitortenorio.notificator.api.v1.output.AuthenticationOutput;
import com.vitortenorio.notificator.entity.authentication.AuthenticationEntity;
import org.springframework.stereotype.Component;


@Component
public class AuthenticationDisassembler implements Disassembler<AuthenticationEntity, AuthenticationOutput> {
    @Override
    public AuthenticationOutput toOutput(AuthenticationEntity entity) {
        return new AuthenticationOutput(entity.token(), entity.refreshToken());
    }
}
