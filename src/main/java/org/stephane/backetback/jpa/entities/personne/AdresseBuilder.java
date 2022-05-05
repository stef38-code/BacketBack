package org.stephane.backetback.jpa.entities.personne;

import java.util.Set;

public final class AdresseBuilder {
    private Adresse adresse;

    private AdresseBuilder() {
        adresse = new Adresse();
    }

    public static AdresseBuilder create() {
        return new AdresseBuilder();
    }

    public AdresseBuilder id(String id) {
        adresse.setId(id);
        return this;
    }

    public AdresseBuilder appartementEscalierEtage(String appartementEscalierEtage) {
        adresse.setAppartementEscalierEtage(appartementEscalierEtage);
        return this;
    }

    public AdresseBuilder batimentResidence(String batimentResidence) {
        adresse.setBatimentResidence(batimentResidence);
        return this;
    }

    public AdresseBuilder numeroNomVoie(String numeroNomVoie) {
        adresse.setNumeroNomVoie(numeroNomVoie);
        return this;
    }

    public AdresseBuilder complementAdresse(String complementAdresse) {
        adresse.setComplementAdresse(complementAdresse);
        return this;
    }

    public AdresseBuilder codePostal(String codePostal) {
        adresse.setCodePostal(codePostal);
        return this;
    }

    public AdresseBuilder ville(String ville) {
        adresse.setVille(ville);
        return this;
    }

    public AdresseBuilder pays(String pays) {
        adresse.setPays(pays);
        return this;
    }

    public AdresseBuilder personnes(Set<Personne> personnes) {
        adresse.setPersonnes(personnes);
        return this;
    }

    public Adresse build() {
        return adresse;
    }
}
