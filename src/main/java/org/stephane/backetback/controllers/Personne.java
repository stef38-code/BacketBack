package org.stephane.backetback.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stephane.backetback.services.PersonneService;
import org.stephane.backetback.share.dto.personne.PersonneDto;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(
        value = "personnes",
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
@Slf4j
public class Personne {
    private final PersonneService service;

    @GetMapping
    public ResponseEntity<Collection<PersonneDto>> lister() {
        List<PersonneDto> liste = service.getAll();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }
}
