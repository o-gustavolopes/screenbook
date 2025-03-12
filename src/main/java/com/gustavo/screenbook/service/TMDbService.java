package com.gustavo.screenbook.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gustavo.screenbook.model.TMDbMovie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TMDbService {
    private final String API_KEY = "0000";  // Substitua pela sua chave de API
    private final String BASE_URL = "https://api.themoviedb.org/3/search/movie";

    public TMDbMovie searchMovie(String title) {
        String url = BASE_URL + "?api_key=" + API_KEY + "&query=" + title;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.getBody(), TMDbMovie.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
