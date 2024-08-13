package com.projeto_verao.gestao.api.domain.repositories;

import com.projeto_verao.gestao.api.domain.entity.musclegroup.MuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MuscleGroupRepository extends JpaRepository<MuscleGroup, UUID> {
}
