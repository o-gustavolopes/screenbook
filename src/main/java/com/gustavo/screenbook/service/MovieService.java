package com.gustavo.screenbook.service;

import com.gustavo.screenbook.model.Movie;
import com.gustavo.screenbook.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }
}
