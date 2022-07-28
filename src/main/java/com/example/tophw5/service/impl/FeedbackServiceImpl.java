package com.example.tophw5.service.impl;

import com.example.tophw5.dao.FeedbackDao;
import com.example.tophw5.entity.Feedback;
import com.example.tophw5.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackDao feedbackDao;

    @Override
    public List<Feedback> getAllByRestaurantID(Integer id) {
        return feedbackDao.getAllByRestaurantID(id);
    }

    @Override
    public Double getRating(Integer restaurantID) {
        return feedbackDao.getRating(restaurantID);
    }

    @Override
    public void addFeedback(Feedback feedback) {
        feedbackDao.addFeedback(feedback);
    }

    @Override
    public void changeFeedbackByID(Integer feedbackID, String newFeedback, Integer newRating) {
        feedbackDao.changeFeedbackByID(feedbackID, newFeedback, newRating);
    }
}
