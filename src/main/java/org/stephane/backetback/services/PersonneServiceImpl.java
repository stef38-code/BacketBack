package org.stephane.backetback.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.stephane.backetback.jpa.entities.Personne;
import org.stephane.backetback.jpa.repository.PersonneRepository;
import org.stephane.backetback.share.dto.PersonneDto;
import org.stephane.backetback.share.mapper.factory.CreateMapperDto;
import org.stephane.backetback.share.mapper.factory.TypeServiceMapperDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonneServiceImpl extends CreateMapperDto<PersonneDto, Personne>  implements PersonneService{
    private final PersonneRepository repository;

    @Override
    public List<PersonneDto> getAll(){
        return getMapper(TypeServiceMapperDto.PERSONNE).toEntities(repository.findAll());
    }
}
