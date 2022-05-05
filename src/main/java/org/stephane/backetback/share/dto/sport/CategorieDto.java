package org.stephane.backetback.share.dto.sport;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class CategorieDto implements Serializable {
    private final String id;
    private final String nom;
    private final String libelle;
    private final String complementaire;
}
