package com.projeto_verao.gestao.api.domain.entity.training.training;

import com.projeto_verao.gestao.api.domain.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "training_histories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "training_id", nullable = false)
    private Training training;

    private LocalDateTime date;
    private int duration;
    private String notes;
}
