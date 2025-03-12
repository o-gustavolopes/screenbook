package com.gustavo.screenbook.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TMDbMovie {
    private String title;
    private String overview;
    private String posterPath;
    private String backdropPath;
    private String releaseDate;
}
