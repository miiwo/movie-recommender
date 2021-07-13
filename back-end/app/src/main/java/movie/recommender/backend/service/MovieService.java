package movie.recommender.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie.recommender.backend.model.MovieMood;
import movie.recommender.backend.model.dto.Movie;
import movie.recommender.backend.repository.MovieMoodRepository;

@Service
public class MovieService {

    @Autowired
    private MovieMoodRepository movieMoodRepository;

    /**
     * Get a certain number of movies for a specified mood.
     * Consider renaming this method to include/hint at it gives recommendations.
     * Maybe rename this class.
     * @param mood
     * @param numMovies
     * @return
     */
    public List<Movie> getMoviesFor(String mood, int numMovies) {
        // Grab movies from repo
        List<MovieMood> moodMovies = movieMoodRepository.findAllMoviesThatAre(mood);

        // Grab numMovies of movies
        moodMovies = moodMovies.subList(0, numMovies);

        // Turn them into MovieDTOs
        List<Movie> movies = List.of();
        for (MovieMood movie : moodMovies) {
            grabMovieDetails(movie.getId());
        }

        // Return list
        return movies;
    }

    /**
     * Calls the movie database api to construct a fully functional object.
     * @param movieId
     * @return
     */
    private Movie grabMovieDetails(long movieId) {
        return new Movie();
    }
}
