package org.stephane.backetback.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stephane.backetback.jpa.entities.sport.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, String> {
}
