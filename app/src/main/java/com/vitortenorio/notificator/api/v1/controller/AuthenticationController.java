package com.vitortenorio.notificator.api.v1.controller;


import com.vitortenorio.notificator.entity.authentication.AuthenticationRequest;
import com.vitortenorio.notificator.entity.authentication.AuthenticationResponse;
import com.vitortenorio.notificator.usecase.authentication.LoginUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/authentication")
public class AuthenticationController {
    private final LoginUseCase loginUseCase;

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody AuthenticationRequest login) {
        return loginUseCase.execute(login);
    }
}
