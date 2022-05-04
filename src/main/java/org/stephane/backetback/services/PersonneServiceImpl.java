package org.stephane.backetback.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.stephane.backetback.jpa.entities.Personne;
import org.stephane.backetback.jpa.entities.PersonneRepository;
import org.stephane.backetback.share.dto.PersonneDto;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonneServiceImpl implements PersonneService{
    private final PersonneRepository repository;

    @Override
    public List<PersonneDto> getAll(){
        /*return repository.findAll();*/
        return Collections.emptyList();
    }
}
