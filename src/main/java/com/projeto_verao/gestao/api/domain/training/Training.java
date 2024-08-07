package com.projeto_verao.gestao.api.domain.training;

import com.projeto_verao.gestao.api.domain.exercise.Exercise;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "trainings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;
    private String description;

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