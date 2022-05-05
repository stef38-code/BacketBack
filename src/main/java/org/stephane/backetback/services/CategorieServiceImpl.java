package org.stephane.backetback.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.stephane.backetback.jpa.entities.sport.Categorie;
import org.stephane.backetback.jpa.repository.CategorieRepository;
import org.stephane.backetback.share.dto.sport.CategorieDto;
import org.stephane.backetback.share.mapper.factory.CreateMapperDto;
import org.stephane.backetback.share.mapper.factory.TypeServiceMapperDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorieServiceImpl extends CreateMapperDto<CategorieDto, Categorie> implements CategorieService {
    private final CategorieRepository repository;

    @Override
    public List<CategorieDto> getAll() {
        return getMapper(TypeServiceMapperDto.CATEGORIE).toEntities(repository.findAll());
    }
}
