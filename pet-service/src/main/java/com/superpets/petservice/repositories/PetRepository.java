package com.superpets.petservice.repositories;

import com.superpets.petservice.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}