package com.superpets.missionservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String difficulty; // Ex: Easy, Medium, Hard
    // Pour une démo simple, on stocke juste les IDs des animaux assignés
    private String assignedPetIds; // Ex: "1,2,5" - on peut faire mieux avec une relation ManyToMany mais pour la démo c'est suffisant
}