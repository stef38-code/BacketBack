package org.stephane.basketback.personne.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.stephane.basketback.categorie.entities.Categorie;
import org.stephane.basketback.share.jpa.Auditable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "personne")
@EntityListeners(AuditingEntityListener.class)
public class Personne extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 4247719986147775328L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    @NotBlank(message = "Le nom est obligatoire")
    @NotNull
    private String nom;
    @NotBlank
    @NotNull
    private String prenom;

    private LocalDate dnaissance;
    @Enumerated
    @Column(name = "genre")
    private Genre genre;
    private String nlicence;
    @ManyToMany(targetEntity = Adresse.class, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JsonBackReference
    @JoinTable(name = "personne_adresse", joinColumns = {@JoinColumn(name = "PERSONNE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "ADRESSE_ID", nullable = false)})
    @Fetch(FetchMode.SELECT)
    private Set<Adresse> adresses = new HashSet<>();

    @ManyToMany(targetEntity = Categorie.class, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JsonBackReference
    @JoinTable(name = "personne_categorie", joinColumns = {@JoinColumn(name = "PERSONNE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "CATEGORIE_ID", nullable = false)})
    @Fetch(FetchMode.SELECT)
    private Set<Categorie> categories = new HashSet<>();
}
