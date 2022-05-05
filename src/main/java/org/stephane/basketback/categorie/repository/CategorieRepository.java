package org.stephane.basketback.categorie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stephane.basketback.categorie.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, String> {
}
