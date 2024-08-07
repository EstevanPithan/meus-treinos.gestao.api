package com.projeto_verao.gestao.api.repositories;

import com.projeto_verao.gestao.api.domain.training.TrainingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainingHistoryRepository extends JpaRepository<TrainingHistory, UUID> {
}
