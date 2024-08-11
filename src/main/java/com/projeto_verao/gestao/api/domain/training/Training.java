package com.projeto_verao.gestao.api.domain.training;

import com.projeto_verao.gestao.api.domain.baseentity.BaseEntity;
import com.projeto_verao.gestao.api.domain.exercise.Exercise;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "trainings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Training extends BaseEntity {
    @ManyToMany
    @JoinTable(
            name = "training_exercises",
            joinColumns = @JoinColumn(name = "training_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id")
    )
    private List<Exercise> exercises;

    @OneToMany(mappedBy = "training")
    private List<TrainingHistory> trainingHistories;
}