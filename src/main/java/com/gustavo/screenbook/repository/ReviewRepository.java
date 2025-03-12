package com.gustavo.screenbook.repository;

import com.gustavo.screenbook.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {}
