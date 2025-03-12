package com.gustavo.screenbook.service;

import com.gustavo.screenbook.model.Review;
import com.gustavo.screenbook.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

    public Review createReview(Review review){
        return reviewRepository.save(review);
    }
}
