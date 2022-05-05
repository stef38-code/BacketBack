package org.stephane.basketback.categorie.entities;

import org.stephane.basketback.personne.entities.Genre;
import org.stephane.basketback.personne.entities.Personne;

import java.util.Set;

public final class CategorieBuilder {
    private Categorie categorie;

    private CategorieBuilder() {
        categorie = new Categorie();
    }

    public static CategorieBuilder create() {
        return new CategorieBuilder();
    }

    public CategorieBuilder id(String id) {
        categorie.setId(id);
        return this;
    }

    public CategorieBuilder nom(String nom) {
        categorie.setNom(nom);
        return this;
    }

    public CategorieBuilder libelle(String libelle) {
        categorie.setLibelle(libelle);
        return this;
    }

    public CategorieBuilder complementaire(String complementaire) {
        categorie.setComplementaire(complementaire);
        return this;
    }

    public CategorieBuilder personnes(Set<Personne> personnes) {
        categorie.setPersonnes(personnes);
        return this;
    }

    public CategorieBuilder genre(Genre genre) {
        categorie.setGenre(genre);
        return this;
    }

    public Categorie build() {
        return categorie;
    }
}
