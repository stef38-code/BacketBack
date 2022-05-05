package org.stephane.backetback.share.mapper;

import org.mapstruct.Mapper;
import org.stephane.backetback.jpa.entities.personne.Personne;
import org.stephane.backetback.share.dto.personne.PersonneDto;
import org.stephane.backetback.share.mapper.factory.ServiceMapperDto;

@Mapper
public abstract class PersonneDtoMapper extends ServiceMapperDto<PersonneDto, Personne> {

    public abstract PersonneDto toEntity(Personne personne);

    public abstract Personne toDto(PersonneDto personneDto);
}
