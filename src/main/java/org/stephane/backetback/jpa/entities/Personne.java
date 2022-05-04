package org.stephane.backetback.jpa.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "personne")
public class Personne implements Serializable {
    private static final long serialVersionUID = 4247719986147775328L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    private String nom;
    private String prenom;
    private LocalDate dnaissance;
    @Enumerated
    @Column(name = "genre")
    private Genre genre;

}
