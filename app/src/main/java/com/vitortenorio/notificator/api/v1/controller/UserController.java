package com.vitortenorio.notificator.api.v1.controller;

import com.vitortenorio.notificator.entity.user.UserRequest;
import com.vitortenorio.notificator.usecase.user.RegisterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
public class UserController {
    private final RegisterUseCase registerUseCase;

    @PostMapping("/register")
    public String register(@RequestBody UserRequest userRequest) throws Exception {
        Thread.sleep(3000);
        return registerUseCase.execute(userRequest);
    }
}
