package com.example.sakila.controllers;

import com.example.sakila.dto.input.ActorInput;
import com.example.sakila.dto.input.FilmInput;
import com.example.sakila.dto.input.ValidationGroup;
import com.example.sakila.dto.output.ActorOutput;
import com.example.sakila.dto.output.FilmOutput;
import com.example.sakila.entites.Actor;
import com.example.sakila.entites.Film;
import com.example.sakila.entites.Language;
import com.example.sakila.repositories.FilmPageRepository;
import com.example.sakila.repositories.FilmRepository;
import com.example.sakila.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.security.auth.callback.LanguageCallback;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmPageRepository filmPageRepository;
    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping
    public ResponseEntity<List<FilmOutput>> readAll(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize) {

        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Film> filmsPage = filmPageRepository.findAll(pageable);

        List<FilmOutput> films = filmsPage.stream()
                .map(FilmOutput::from)
                .collect(Collectors.toList());

        return new ResponseEntity<>(films, new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public FilmOutput readById(@PathVariable Short id){
        return filmRepository.findById(id)
                .map(FilmOutput::from)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        String.format("No such film with id %d", id)
                ));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FilmOutput create(@Validated(ValidationGroup.Create.class) @RequestBody FilmInput data) {
        final var film = new Film();
        film.setTitle(data.getTitle());
        Language languageWithId = languageRepository.findById(data.getLanguageId())
                .orElseThrow(()-> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "No language with ID"
                        ));
        film.setLanguage(languageWithId);
        film.setRentalDuration(data.getRentalDuration());
        film.setRentalRate(data.getRentalRate());
        film.setRating(data.getRating());
        film.setDescription(data.getDescription());
        film.setReleaseYear(data.getReleaseYear());
        final var saved = filmRepository.save(film);
        return FilmOutput.from(saved);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FilmOutput update(@PathVariable("id") Short id, @Validated @RequestBody FilmInput data) {
        final var film = filmRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No film with ID " + id));

        if (data.getTitle() != null) {
            film.setTitle(data.getTitle());
        }

        if (data.getLanguageId() != null) {
            Language languageWithId = languageRepository.findById(data.getLanguageId())
                    .orElseThrow(() -> new ResponseStatusException(
                            HttpStatus.NOT_FOUND, "No language with ID " + data.getLanguageId()));
            film.setLanguage(languageWithId);
        }

        if (data.getRentalRate() != null) {
            film.setRentalRate(data.getRentalRate());
        }

        if (data.getRating() != null){
            film.setRating(data.getRating());
        }

        final var saved = filmRepository.save(film);
        return FilmOutput.from(saved);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public FilmOutput update(@PathVariable Short id) {
        final var film = filmRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No film with ID " + id));
        filmRepository.delete(film);
        return null;
    }


}


