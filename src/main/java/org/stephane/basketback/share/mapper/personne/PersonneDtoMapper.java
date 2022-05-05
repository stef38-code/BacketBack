package org.stephane.basketback.share.mapper.personne;

import org.mapstruct.Mapper;
import org.stephane.basketback.personne.dto.PersonneDto;
import org.stephane.basketback.personne.entities.Personne;
import org.stephane.basketback.share.mapper.factory.ServiceMapperDto;

@Mapper
public abstract class PersonneDtoMapper extends ServiceMapperDto<PersonneDto, Personne> {

    public abstract PersonneDto toEntity(Personne personne);

    public abstract Personne toDto(PersonneDto personneDto);
}
