package org.stephane.basketback.personne.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.*;
import org.stephane.basketback.categorie.dto.CategorieDto;
import org.stephane.basketback.personne.entities.Genre;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonneDto {
    private String id;
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;
    @Past
    @NonNull
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dnaissance;
    private Genre genre;
    private String nlicence;
    private Set<AdresseDto> adresses;
    private Set<CategorieDto> categories;
}
