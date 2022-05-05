package org.stephane.backetback.jpa.entities.sport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.stephane.backetback.jpa.entities.Auditable;

import javax.persistence.*;
import java.io.Serializable;

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

}
