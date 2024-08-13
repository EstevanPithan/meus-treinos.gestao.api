package com.projeto_verao.gestao.api.domain.repositories;

import com.projeto_verao.gestao.api.domain.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
