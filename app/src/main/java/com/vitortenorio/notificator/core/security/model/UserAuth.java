package com.vitortenorio.notificator.core.security.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserAuth {
    private final String userEmail;
    private final int userId;
}
