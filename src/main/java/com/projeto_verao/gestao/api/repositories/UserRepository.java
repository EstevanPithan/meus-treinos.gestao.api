package com.projeto_verao.gestao.api.repositories;

import com.projeto_verao.gestao.api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
