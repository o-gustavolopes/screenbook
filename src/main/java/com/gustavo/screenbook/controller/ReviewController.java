package com.gustavo.screenbook.controller;

import com.gustavo.screenbook.model.Review;
import com.gustavo.screenbook.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor // Lombok vai gerar o construtor automaticamente
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping
    public List<Review> getReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }
}
