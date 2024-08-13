package com.projeto_verao.gestao.api.domain.repositories;

import com.projeto_verao.gestao.api.domain.entity.training.training.TrainingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainingHistoryRepository extends JpaRepository<TrainingHistory, UUID> {
}
