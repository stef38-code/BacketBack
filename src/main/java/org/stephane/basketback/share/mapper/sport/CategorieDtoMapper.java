package org.stephane.basketback.share.mapper.sport;

import org.mapstruct.Mapper;
import org.stephane.basketback.categorie.dto.CategorieDto;
import org.stephane.basketback.categorie.entities.Categorie;
import org.stephane.basketback.share.mapper.factory.ServiceMapperDto;

@Mapper
public abstract class CategorieDtoMapper extends ServiceMapperDto<CategorieDto, Categorie> {

    public abstract CategorieDto toEntity(Categorie categorie);

    public abstract Categorie toDto(CategorieDto categorieDto);
}
