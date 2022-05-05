package org.stephane.backetback.share.dto.personne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdresseDto {
    private String id;
    @NotBlank
    private String appartementEscalierEtage;
    private String batimentResidence;
    private String numeroNomVoie;
    private String complementAdresse;
    private String codePostal;
    private String ville;
    private String pays;
    private Set<PersonneDto> personnes;
}


