package org.stephane.basketback.personne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stephane.basketback.personne.entities.Personne;

import java.util.UUID;

public interface PersonneRepository extends JpaRepository<Personne, UUID> {
}
