package com.projeto_verao.gestao.api.repositories;

import com.projeto_verao.gestao.api.domain.training.Training;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainingRepository extends JpaRepository<Training, UUID> {
}
