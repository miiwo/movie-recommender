package backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.model.Movie;
import backend.repository.MovieRepository;


@Service
public class QuestionnaireService {

    @Autowired
    private MovieRepository movieRepository;


    public Movie getMovieById(long id) {
        return this.movieRepository.findById(id).get();
    }

    public boolean createMovie(String name, String description, String imdbLink) {
        Movie movie = new Movie();
        movie.setName(name);
        movie.setDescription(description);
        movie.setImdbLink(imdbLink);
        this.movieRepository.saveAndFlush(movie);
        return true;
    }

    public void updateMovieScores(long id, int happyScore, int sadScore, int funnyScore){
        Movie movie = getMovieById(id);
        if(happyScore>-1) movie.updateHappyScore(happyScore);
        if(sadScore>-1) movie.updateSadScore(sadScore);
        if(funnyScore>-1) movie.updateFunnyScore(funnyScore);
    }
}
