package movie.recommender.backend.controllers;

import movie.recommender.backend.models.Movie;

import movie.recommender.backend.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

    @Autowired
    FeedbackService service;

    @PostMapping("/feedback")
    public ResponseEntity<String> updateMovieScore(@RequestBody Movie movie) {
        service.updateMovieScore(movie);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
