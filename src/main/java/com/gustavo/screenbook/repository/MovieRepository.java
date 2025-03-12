package com.gustavo.screenbook.repository;

import com.gustavo.screenbook.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
