package org.stephane.basketback.categorie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.stephane.basketback.personne.dto.PersonneDto;
import org.stephane.basketback.personne.entities.Genre;

import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategorieDto implements Serializable {
    private String id;
    private String nom;
    private String libelle;
    private String complementaire;
    private Genre genre;
    private Set<PersonneDto> personnes;
}
