package com.example.CloudKlkv.controllers;

import com.example.CloudKlkv.domain.Movie;
import com.example.CloudKlkv.repositories.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @Autowired
    private IMovieRepository movieRepository;

    @PostMapping
    public ResponseEntity<Movie> create(@RequestBody Movie movie) {
        Movie saved_movie = movieRepository.save(movie);
        return ResponseEntity.ok(saved_movie);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAll() {
        return new ResponseEntity<>(movieRepository.findAll(), HttpStatus.OK );
    }
}
