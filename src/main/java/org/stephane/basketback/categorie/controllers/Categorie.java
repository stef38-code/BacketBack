package org.stephane.basketback.categorie.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stephane.basketback.categorie.dto.CategorieDto;
import org.stephane.basketback.categorie.services.CategorieService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(
        value = "categories",
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
@Slf4j
public class Categorie {
    private final CategorieService service;

    @GetMapping
    public ResponseEntity<Collection<CategorieDto>> lister() {
        List<CategorieDto> liste = service.getAll();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }
}
