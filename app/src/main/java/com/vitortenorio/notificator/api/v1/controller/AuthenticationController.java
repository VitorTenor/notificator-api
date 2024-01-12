package com.vitortenorio.notificator.api.v1.controller;


import com.vitortenorio.notificator.api.v1.disassembler.imp.AuthenticationDisassembler;
import com.vitortenorio.notificator.api.v1.input.LoginInput;
import com.vitortenorio.notificator.api.v1.output.AuthenticationOutput;
import com.vitortenorio.notificator.usecase.authentication.LoginUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/authentication")
public class AuthenticationController {
    private final LoginUseCase loginUseCase;
    private final AuthenticationDisassembler authenticationDisassembler;

    @PostMapping("/login")
    public AuthenticationOutput login(@RequestBody LoginInput login) {
        return authenticationDisassembler.toOutput(loginUseCase.execute(login.toEntity()));
    }
}
