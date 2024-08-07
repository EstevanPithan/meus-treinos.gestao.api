package com.projeto_verao.gestao.api.repositories;

import com.projeto_verao.gestao.api.domain.exercise.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EquipmentRepository extends JpaRepository<Equipment, UUID> {
}
