package org.stephane.backetback.share.mapper;

import org.mapstruct.Mapper;
import org.stephane.backetback.jpa.entities.sport.Categorie;
import org.stephane.backetback.share.dto.sport.CategorieDto;
import org.stephane.backetback.share.mapper.factory.ServiceMapperDto;

@Mapper
public abstract class CategorieDtoMapper extends ServiceMapperDto<CategorieDto, Categorie> {

    public abstract CategorieDto toEntity(Categorie categorie);

    public abstract Categorie toDto(CategorieDto categorieDto);
}
