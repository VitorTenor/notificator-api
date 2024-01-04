package com.vitortenorio.notificator.core.security.service;

import com.vitortenorio.notificator.api.v1.repository.AuthenticationUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SecurityService implements UserDetailsService {

    private final AuthenticationUserRepository authenticationUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return authenticationUserRepository.findUserDetailsByLogin(username);
    }
}
