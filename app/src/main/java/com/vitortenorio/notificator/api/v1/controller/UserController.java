package com.vitortenorio.notificator.api.v1.controller;

import com.vitortenorio.notificator.api.v1.disassembler.imp.MessageDisassembler;
import com.vitortenorio.notificator.api.v1.input.UserRegisterInput;
import com.vitortenorio.notificator.api.v1.output.MessageOutput;
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
    private final MessageDisassembler messageDisassembler;

    @PostMapping("/register")
    public MessageOutput register(@RequestBody UserRegisterInput userRequest) {
        return messageDisassembler.toOutput(registerUseCase.execute(userRequest.toEntity()));
    }
}
