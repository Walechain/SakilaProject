package com.example.sakila.repositories;

import com.example.sakila.entites.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends JpaRepository<Actor, Short> {

}
