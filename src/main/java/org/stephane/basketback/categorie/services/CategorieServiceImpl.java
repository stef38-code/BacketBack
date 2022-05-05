package org.stephane.basketback.categorie.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.stephane.basketback.categorie.dto.CategorieDto;
import org.stephane.basketback.categorie.entities.Categorie;
import org.stephane.basketback.categorie.repository.CategorieRepository;
import org.stephane.basketback.share.mapper.factory.CreateMapperDto;
import org.stephane.basketback.share.mapper.factory.TypeServiceMapperDto;

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
