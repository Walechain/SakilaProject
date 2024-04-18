package com.example.sakila.controllers;

import com.example.sakila.dto.output.CategoryOutput;
import com.example.sakila.dto.output.FilmOutput;
import com.example.sakila.repositories.CategoryRepository;
import com.example.sakila.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


    @RestController
    @RequestMapping("/categories")

    public class CategoryController {
        @Autowired
        private CategoryRepository categoryRepository;

        @GetMapping
        public List<CategoryOutput> readAll() {
            final var categories = categoryRepository.findAll();
            return categories.stream()
                    .map(CategoryOutput::from)
                    .collect(Collectors.toList());
        }

        @GetMapping("/{id}")
        public CategoryOutput readById(@PathVariable Short id){
            return categoryRepository.findById(id)
                    .map(CategoryOutput::from)
                    .orElseThrow(() -> new ResponseStatusException(
                            HttpStatus.NOT_FOUND,
                            String.format("No such film with id %d", id)
                    ));
        }
    }

