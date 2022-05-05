package org.stephane.basketback.categorie.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.stephane.basketback.personne.entities.Genre;
import org.stephane.basketback.personne.entities.Personne;
import org.stephane.basketback.share.jpa.Auditable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "categorie")
@EntityListeners(AuditingEntityListener.class)
public class Categorie extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = -3649076157295243269L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String nom;
    private String libelle;
    private String complementaire;
    @Enumerated
    @Column(name = "genre")
    private Genre genre;
    @ManyToMany(targetEntity = Personne.class, mappedBy = "adresses", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JsonManagedReference
    @Fetch(FetchMode.SUBSELECT)
    private Set<Personne> personnes = new HashSet<>();
}
