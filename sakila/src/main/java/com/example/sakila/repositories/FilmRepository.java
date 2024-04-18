package com.example.sakila.repositories;

import com.example.sakila.entites.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmRepository extends JpaRepository<Film, Short> {
}
