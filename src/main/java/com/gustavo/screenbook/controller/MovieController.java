package com.gustavo.screenbook.controller;

import com.gustavo.screenbook.model.Movie;
import com.gustavo.screenbook.model.TMDbMovie;
import com.gustavo.screenbook.service.MovieService;
import com.gustavo.screenbook.service.TMDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired private MovieService movieService;
    @Autowired private TMDbService tmdbService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @GetMapping("/search")
    public TMDbMovie searchMovies(@RequestParam String title) {
        return tmdbService.searchMovie(title);
    }
}
