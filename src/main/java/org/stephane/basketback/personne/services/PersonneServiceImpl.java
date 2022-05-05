package org.stephane.basketback.personne.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.stephane.basketback.personne.dto.PersonneDto;
import org.stephane.basketback.personne.entities.Personne;
import org.stephane.basketback.personne.repository.PersonneRepository;
import org.stephane.basketback.share.mapper.factory.CreateMapperDto;
import org.stephane.basketback.share.mapper.factory.TypeServiceMapperDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonneServiceImpl extends CreateMapperDto<PersonneDto, Personne> implements PersonneService {
    private final PersonneRepository repository;

    @Override
    public List<PersonneDto> getAll() {
        return getMapper(TypeServiceMapperDto.PERSONNE).toEntities(repository.findAll());
    }
}
