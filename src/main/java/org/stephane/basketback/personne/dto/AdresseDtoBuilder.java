package org.stephane.basketback.personne.dto;

import java.util.Set;

public final class AdresseDtoBuilder {
    private AdresseDto adresseDto;

    private AdresseDtoBuilder() {
        adresseDto = new AdresseDto();
    }

    public static AdresseDtoBuilder create() {
        return new AdresseDtoBuilder();
    }

    public AdresseDtoBuilder id(String id) {
        adresseDto.setId(id);
        return this;
    }

    public AdresseDtoBuilder appartementEscalierEtage(String appartementEscalierEtage) {
        adresseDto.setAppartementEscalierEtage(appartementEscalierEtage);
        return this;
    }

    public AdresseDtoBuilder batimentResidence(String batimentResidence) {
        adresseDto.setBatimentResidence(batimentResidence);
        return this;
    }

    public AdresseDtoBuilder numeroNomVoie(String numeroNomVoie) {
        adresseDto.setNumeroNomVoie(numeroNomVoie);
        return this;
    }

    public AdresseDtoBuilder complementAdresse(String complementAdresse) {
        adresseDto.setComplementAdresse(complementAdresse);
        return this;
    }

    public AdresseDtoBuilder codePostal(String codePostal) {
        adresseDto.setCodePostal(codePostal);
        return this;
    }

    public AdresseDtoBuilder ville(String ville) {
        adresseDto.setVille(ville);
        return this;
    }

    public AdresseDtoBuilder pays(String pays) {
        adresseDto.setPays(pays);
        return this;
    }

    public AdresseDtoBuilder personnes(Set<PersonneDto> personnes) {
        adresseDto.setPersonnes(personnes);
        return this;
    }

    public AdresseDto build() {
        return adresseDto;
    }
}
