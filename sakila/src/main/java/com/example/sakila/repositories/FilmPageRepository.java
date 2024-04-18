package com.example.sakila.repositories;

import com.example.sakila.entites.Film;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmPageRepository extends PagingAndSortingRepository<Film, Short> {

}
