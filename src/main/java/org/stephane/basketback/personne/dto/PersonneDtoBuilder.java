package org.stephane.basketback.personne.dto;

import org.stephane.basketback.categorie.dto.CategorieDto;
import org.stephane.basketback.personne.entities.Genre;

import java.time.LocalDate;
import java.util.Set;

public final class PersonneDtoBuilder {
    private PersonneDto personneDto;

    private PersonneDtoBuilder() {
        personneDto = new PersonneDto();
    }

    public static PersonneDtoBuilder create() {
        return new PersonneDtoBuilder();
    }

    public PersonneDtoBuilder id(String id) {
        personneDto.setId(id);
        return this;
    }

    public PersonneDtoBuilder nom(String nom) {
        personneDto.setNom(nom);
        return this;
    }

    public PersonneDtoBuilder prenom(String prenom) {
        personneDto.setPrenom(prenom);
        return this;
    }

    public PersonneDtoBuilder dnaissance(LocalDate dnaissance) {
        personneDto.setDnaissance(dnaissance);
        return this;
    }

    public PersonneDtoBuilder genre(Genre genre) {
        personneDto.setGenre(genre);
        return this;
    }

    public PersonneDtoBuilder nlicence(String nlicence) {
        personneDto.setNlicence(nlicence);
        return this;
    }

    public PersonneDtoBuilder adresses(Set<AdresseDto> adresses) {
        personneDto.setAdresses(adresses);
        return this;
    }

    public PersonneDtoBuilder categories(Set<CategorieDto> categories) {
        personneDto.setCategories(categories);
        return this;
    }

    public PersonneDto build() {
        return personneDto;
    }
}
