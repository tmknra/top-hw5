package com.example.tophw5.dao;

import com.example.tophw5.entity.Feedback;

import java.util.List;

public interface FeedbackDao {
    List<Feedback> getAllByRestaurantID(Integer id);
    Double getRating(Integer restaurantID);

    void addFeedback(Feedback feedback);
    void changeFeedbackByID(Integer feedbackID, String newFeedback, Integer newRating);
}
