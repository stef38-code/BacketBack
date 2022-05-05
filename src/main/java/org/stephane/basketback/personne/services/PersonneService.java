package org.stephane.basketback.personne.services;

import org.stephane.basketback.personne.dto.PersonneDto;

import java.util.List;

public interface PersonneService {
    List<PersonneDto> getAll();
}
