package com.example.CloudKlkv.repositories;

import com.example.CloudKlkv.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository  extends JpaRepository<Movie, Long> {

}
