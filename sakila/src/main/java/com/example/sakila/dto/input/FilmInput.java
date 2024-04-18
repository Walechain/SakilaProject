package com.example.sakila.dto.input;

import com.example.sakila.entites.Rating;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilmInput {
    @NotNull(groups = {ValidationGroup.Create.class})
    @Size(min = 1, max = 128)
    private String title;

    @NotNull(groups = {ValidationGroup.Create.class})
    private Byte languageId;

    @NotNull(groups = {ValidationGroup.Create.class})
    private BigDecimal rentalRate;

    @NotNull(groups = {ValidationGroup.Create.class})
    private Byte rentalDuration;


    private Integer releaseYear;

    private String description;

    private Rating rating;
}
