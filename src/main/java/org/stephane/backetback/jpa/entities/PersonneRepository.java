package org.stephane.backetback.jpa.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonneRepository extends JpaRepository<Personne, UUID> {
}
