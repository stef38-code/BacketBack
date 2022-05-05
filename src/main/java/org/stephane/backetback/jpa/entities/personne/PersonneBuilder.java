package org.stephane.backetback.jpa.entities.personne;

import java.time.LocalDate;
import java.util.Set;

public final class PersonneBuilder {
    private String id;
    private String nom;
    private String prenom;
    private LocalDate dnaissance;
    private Genre genre;
    private String nlicence;
    private Set<Adresse> adresses;

    private PersonneBuilder() {
    }

    public static PersonneBuilder create() {
        return new PersonneBuilder();
    }

    public PersonneBuilder id(String id) {
        this.id = id;
        return this;
    }

    public PersonneBuilder nom(String nom) {
        this.nom = nom;
        return this;
    }

    public PersonneBuilder prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public PersonneBuilder dnaissance(LocalDate dnaissance) {
        this.dnaissance = dnaissance;
        return this;
    }

    public PersonneBuilder genre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public PersonneBuilder nlicence(String nlicence) {
        this.nlicence = nlicence;
        return this;
    }

    public Personne build() {
        Personne personne = new Personne();
        personne.setId(id);
        personne.setNom(nom);
        personne.setPrenom(prenom);
        personne.setDnaissance(dnaissance);
        personne.setGenre(genre);
        personne.setNlicence(nlicence);
        personne.setAdresses(adresses);

        return personne;
    }

    public PersonneBuilder adresses(Set<Adresse> adresses) {
        this.adresses = adresses;
        return this;
    }
}
