package com.projeto_verao.gestao.api.repositories;

import com.projeto_verao.gestao.api.domain.exercise.Exercise;
import com.projeto_verao.gestao.api.domain.musclegroup.MuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MuscleGroupRepository extends JpaRepository<MuscleGroup, UUID> {
}
