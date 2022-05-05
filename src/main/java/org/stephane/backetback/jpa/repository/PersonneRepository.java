package org.stephane.backetback.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stephane.backetback.jpa.entities.personne.Personne;

import java.util.UUID;

public interface PersonneRepository extends JpaRepository<Personne, UUID> {
}
