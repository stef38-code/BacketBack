package org.stephane.backetback.share.dto.personne;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.*;
import org.stephane.backetback.jpa.entities.personne.Genre;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
