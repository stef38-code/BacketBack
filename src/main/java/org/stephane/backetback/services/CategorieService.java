package org.stephane.backetback.services;

import org.stephane.backetback.share.dto.sport.CategorieDto;

import java.util.List;

public interface CategorieService {
    List<CategorieDto> getAll();
}
