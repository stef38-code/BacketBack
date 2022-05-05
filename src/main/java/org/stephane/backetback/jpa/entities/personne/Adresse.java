package org.stephane.backetback.jpa.entities.personne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.stephane.backetback.jpa.entities.Auditable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adresse")
@EntityListeners(AuditingEntityListener.class)
public class Adresse extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 5127719986147775328L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String appartementEscalierEtage;
    private String batimentResidence;
    private String numeroNomVoie;
    private String complementAdresse;
    private String codePostal;
    private String ville;
    private String pays;

    @ManyToMany(targetEntity = Personne.class, mappedBy = "adresses", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JsonManagedReference
    @Fetch(FetchMode.SUBSELECT)
    private Set<Personne> personnes = new HashSet<>();
}
