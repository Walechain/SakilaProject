package com.example.sakila.entites;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "film")
@Getter
@Setter
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Short id;
    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name= "language_id")
    private Language language;

    @Column(name="rental_rate")
    private BigDecimal rentalRate;

    @Column(name = "rental_duration")
    private  Byte rentalDuration;

    @ManyToMany(mappedBy = "films")
    private List<Actor> cast = new ArrayList<>();

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;


//
//    @Enumerated(EnumType.STRING)
//    private Rating rating;

    private Rating rating;

}


