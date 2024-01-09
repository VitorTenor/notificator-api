package com.vitortenorio.notificator.api.v1.client;

import com.vitortenorio.notificator.api.v1.model.AuthenticationUserModel;
import com.vitortenorio.notificator.api.v1.model.UserModel;
import com.vitortenorio.notificator.api.v1.repository.AuthenticationUserRepository;
import com.vitortenorio.notificator.api.v1.repository.UserRepository;
import com.vitortenorio.notificator.entity.enums.UserType;
import com.vitortenorio.notificator.entity.user.UserRequest;
import com.vitortenorio.notificator.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class UserClient implements UserGateway {
    private final UserRepository userRepository;
    private final AuthenticationUserRepository authenticationUserRepository;


    @Override
    @Transactional
    public String register(UserRequest userRequest) {

        final var userModel = createUserModel(userRequest);
        final var userAuth = createUserAuth(userRequest);

        userRepository.save(userModel);
        authenticationUserRepository.save(userAuth);

        return "User created successfully";
    }

    private AuthenticationUserModel createUserAuth(UserRequest userRequest) {
        final var userAuth = new AuthenticationUserModel();
        userAuth.setEmail(userRequest.email());
        userAuth.setLogin(userRequest.email());
        userAuth.setUsername(userRequest.username());
        userAuth.setEnabled(true);
        userAuth.setPassword(new BCryptPasswordEncoder().encode(userRequest.password()));
        userAuth.setCreatedAt(LocalDateTime.now());
        userAuth.setUpdatedAt(LocalDateTime.now());
        userAuth.setRole(UserType.ADMIN);
        return userAuth;
    }

    private UserModel createUserModel(UserRequest userRequest) {
        final var userModel = new UserModel();
        userModel.setUsername(userRequest.username());
        userModel.setEmail(userRequest.email());
        userModel.setCreatedAt(LocalDateTime.now());
        userModel.setUpdatedAt(LocalDateTime.now());
        userModel.setEnabled(true);
        return userModel;
    }
}
