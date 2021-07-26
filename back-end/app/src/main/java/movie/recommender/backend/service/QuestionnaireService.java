package movie.recommender.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie.recommender.backend.models.Movie;
import movie.recommender.backend.repository.MovieRepository;


@Service
public class QuestionnaireService {

    @Autowired
    private MovieRepository movieRepository;


    public String getMovieById(long id) {
        Movie theMovie = this.movieRepository.findById(id).get();

        return theMovie.getName();
    }
}
