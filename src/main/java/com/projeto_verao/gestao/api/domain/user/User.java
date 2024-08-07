package com.projeto_verao.gestao.api.domain.user;

import com.projeto_verao.gestao.api.domain.training.TrainingHistory;
import com.projeto_verao.gestao.api.domain.training.TrainingPlan;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;
    private String email;
    private String password;
    private String type; // "Student" or "Instructor"
    private LocalDate dateOfBirth;
    private LocalDate registrationDate;

    @OneToMany(mappedBy = "user")
    private List<TrainingPlan> trainingPlans;

    @OneToMany(mappedBy = "user")
    private List<TrainingHistory> trainingHistories;
}

