package com.gustavo.screenbook.controller;

import com.gustavo.screenbook.model.TMDbMovie;
import com.gustavo.screenbook.service.TMDbService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tmdb")
public class TMDbController {

    private final TMDbService tmdbService;

    public TMDbController(TMDbService tmdbService) {
        this.tmdbService = tmdbService;
    }

    @GetMapping("/search")
    public TMDbMovie searchMovies(@RequestParam String title) {
        return tmdbService.searchMovie(title);
    }
}
