package org.stephane.basketback.categorie.dto;

import org.stephane.basketback.personne.dto.PersonneDto;

import java.util.Set;

public final class CategorieDtoBuilder {
    private CategorieDto categorieDto;

    private CategorieDtoBuilder() {
        categorieDto = new CategorieDto();
    }

    public static CategorieDtoBuilder create() {
        return new CategorieDtoBuilder();
    }

    public CategorieDtoBuilder id(String id) {
        categorieDto.setId(id);
        return this;
    }

    public CategorieDtoBuilder nom(String nom) {
        categorieDto.setNom(nom);
        return this;
    }

    public CategorieDtoBuilder libelle(String libelle) {
        categorieDto.setLibelle(libelle);
        return this;
    }

    public CategorieDtoBuilder complementaire(String complementaire) {
        categorieDto.setComplementaire(complementaire);
        return this;
    }

    public CategorieDtoBuilder personnes(Set<PersonneDto> personnes) {
        categorieDto.setPersonnes(personnes);
        return this;
    }

    public CategorieDto build() {
        return categorieDto;
    }
}
