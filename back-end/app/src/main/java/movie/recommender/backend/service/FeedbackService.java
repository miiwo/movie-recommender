package movie.recommender.backend.service;

import movie.recommender.backend.repository.MovieRepository;
import movie.recommender.backend.models.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    MovieRepository movieRepository;

    public void updateMovieScore(Movie movie) {
        movieRepository.updateMovieScores(movie.getHappyScore(), movie.getSadScore(), movie.getFunnyScore(), movie.getMovieId());
    }
}
