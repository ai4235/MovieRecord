package com.example.movie_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Movie {
    @Id
    int id;

    String title;
    int releasedYear;
    String director;
    String mainCast;
    String country;
    String distributor;

    LocalDate watchedDate;
    String comment;
}
