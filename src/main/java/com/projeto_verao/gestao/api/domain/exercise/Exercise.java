package com.projeto_verao.gestao.api.domain.exercise;

import com.projeto_verao.gestao.api.domain.baseentity.BaseEntity;
import com.projeto_verao.gestao.api.domain.musclegroup.MuscleGroup;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "exercises")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Exercise extends BaseEntity {
    @ManyToMany
    @JoinTable(
            name = "exercise_muscle_group",
            joinColumns = @JoinColumn(name = "exercise_id"),
            inverseJoinColumns = @JoinColumn(name = "muscle_group_id")
    )
    private List<MuscleGroup> muscleGroups;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;
}
