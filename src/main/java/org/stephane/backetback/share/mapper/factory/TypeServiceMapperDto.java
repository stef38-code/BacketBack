package org.stephane.backetback.share.mapper.factory;

import org.stephane.backetback.share.mapper.CategorieDtoMapper;
import org.stephane.backetback.share.mapper.PersonneDtoMapper;

public enum TypeServiceMapperDto {
    PERSONNE(PersonneDtoMapper.class), CATEGORIE(CategorieDtoMapper.class);

    private Class<? extends ServiceMapperDto> mapperClass;

    TypeServiceMapperDto(Class<? extends ServiceMapperDto> mapperClass) {
        this.mapperClass = mapperClass;
    }

    public Class<? extends ServiceMapperDto> getMapperClass() {
        return this.mapperClass;
    }
}
