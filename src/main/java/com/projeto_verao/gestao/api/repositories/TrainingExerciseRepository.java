package com.projeto_verao.gestao.api.repositories;

import com.projeto_verao.gestao.api.domain.musclegroup.MuscleGroup;
import com.projeto_verao.gestao.api.domain.training.TrainingExercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainingExerciseRepository extends JpaRepository<TrainingExercise, UUID> {
}
