package com.vitortenorio.notificator.api.v1.repository;

import com.vitortenorio.notificator.api.v1.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {
}
