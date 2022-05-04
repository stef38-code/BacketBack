package org.stephane.backetback.services;

import org.stephane.backetback.jpa.entities.Personne;

import java.util.List;

public interface PersonneService {
    List<PersonneDTo> getAll();
}
