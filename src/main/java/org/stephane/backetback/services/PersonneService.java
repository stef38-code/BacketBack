package org.stephane.backetback.services;

import org.stephane.backetback.share.dto.personne.PersonneDto;

import java.util.List;

public interface PersonneService {
    List<PersonneDto> getAll();
}
