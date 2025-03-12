package com.gustavo.screenbook.controller;

import com.gustavo.screenbook.model.Movie;
import com.gustavo.screenbook.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor // Lombok vai gerar o construtor automaticamente
public class MovieController {
    private final MovieService movieService;

    @GetMapping
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }
}
