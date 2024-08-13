package com.projeto_verao.gestao.api.application.dto.user;

import com.projeto_verao.gestao.api.application.dto.GenericIdNameDto;

import java.util.List;
import java.util.UUID;

public record UserResponseDto(
        UUID id,
        String name,
        String email,
        String type, // "Student" or "Instructor"
        String dateOfBirth,
        String registrationDate,
        List<GenericIdNameDto> trainingPlans,
        List<GenericIdNameDto> trainingHistories
) {
}
