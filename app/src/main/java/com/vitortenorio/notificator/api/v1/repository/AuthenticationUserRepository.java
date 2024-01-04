package com.vitortenorio.notificator.api.v1.repository;

import com.vitortenorio.notificator.api.v1.model.AuthenticationUserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationUserRepository extends JpaRepository<AuthenticationUserModel, String> {
    AuthenticationUserModel findByLogin(String login);

    UserDetails findUserDetailsByLogin(String login);
}
