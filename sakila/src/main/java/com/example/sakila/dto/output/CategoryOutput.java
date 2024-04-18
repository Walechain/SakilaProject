package com.example.sakila.dto.output;

import com.example.sakila.entites.Actor;
import com.example.sakila.entites.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class CategoryOutput{
    private Short id;
    private String name;

    private List<FilmReferenceOutput> films;

    public static CategoryOutput from(Category category) {
        return new CategoryOutput(
                category.getId(),
                category.getName(),
                category.getFilms().stream().map(FilmReferenceOutput::from).collect(Collectors.toList())
        );
    }

    public String getFullName(){
        return id + " " + name;
    }

}