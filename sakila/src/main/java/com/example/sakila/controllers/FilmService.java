package com.example.sakila.controllers;

import com.example.sakila.entites.Film;
import com.example.sakila.repositories.FilmPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmPageRepository filmPageRepository;

    public List<Film> getAllFilms(Integer pageNo, Integer pageSize){
        PageRequest paging = PageRequest.of(pageNo, pageSize);
        Page<Film> pagedResult = filmPageRepository.findAll(paging);
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        }else {
            return new ArrayList<Film>();
        }
    }
}
