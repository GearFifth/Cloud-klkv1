package com.example.CloudKlkv.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "sv_71_2021")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private Long year;

    public Movie(String title, String genre, long year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
}
