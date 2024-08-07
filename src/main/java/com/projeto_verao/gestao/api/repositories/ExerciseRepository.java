package com.projeto_verao.gestao.api.repositories;

import com.projeto_verao.gestao.api.domain.exercise.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExerciseRepository extends JpaRepository<Exercise, UUID> {
}
