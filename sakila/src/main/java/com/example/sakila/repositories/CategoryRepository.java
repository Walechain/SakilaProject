package com.example.sakila.repositories;

import com.example.sakila.entites.Category;
import com.example.sakila.entites.Film;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Short> {

}
