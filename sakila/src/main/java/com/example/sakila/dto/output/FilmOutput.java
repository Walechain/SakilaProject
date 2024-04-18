package com.example.sakila.dto.output;

import com.example.sakila.entites.Film;
import com.example.sakila.entites.Language;
import com.example.sakila.entites.Rating;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class FilmOutput {
    private Short id;
    private String title;
    private Language language;
    private BigDecimal rentalRate;
    private String description;
    private Integer releaseYear;
    private Rating rating;
    private List<ActorReferenceOutput> cast;

    public static FilmOutput from(Film film){
        return new FilmOutput(
                film.getId(),
                film.getTitle(),
                film.getLanguage(),
                film.getRentalRate(),
                film.getDescription(),
                film.getReleaseYear(),
                film.getRating(),
                film.getCast().stream().map(ActorReferenceOutput::from).collect(Collectors.toList())
        );
    }

    public String getFullFilm(){
        return title + " " + getLanguage().getId();
    }
}
