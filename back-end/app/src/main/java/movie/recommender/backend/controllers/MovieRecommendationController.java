package movie.recommender.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import movie.recommender.backend.models.Movie;

@RestController
@RequestMapping("/recommendations")
public class MovieRecommendationController {

    private UserService userService;
    private MovieService movieService;

    /**
     * Method that returns a bunch of Movie objects to the user in JSON format
     * that it recommends based off of mood. This is for a user.
     * @return List of Movies
     */
    @GetMapping("/{mood}")
    public ResponseEntity<List<Movie>> getRecommendationsFor(@PathVariable String mood, @RequestParam("user") Optional<String> user) {
        List<Movie> recommendations;

        // Get a list of movies that are deemed "whatever emotion" was requested
        recommendations = movieService.getMoviesFor(mood, 5); // Grab 5 for now

        // Request param User? 
        if (user.isPresent()) {
            // Verify user
            if(userService.verifyUser(user.get())) {
                // Get list of movies a user has watched (Discuss whether this should be in User or Movie)
                List<Movie> userWatchList = userService.getMoviesFor(user.get());
                // Filter out movies / get more if client has watched some already
                filterMovieList(recommendations, alreadyWatchedList);
            }
        }
        
        // Return the recommendations
        return ResponseEntity.ok(recommendations);
    }

    /**
     * This is when given a list of movies.
     * Use case for no users option.
     * @param mood
     * @param moviesWatched
     * @return
     */
    @GetMapping("/mood")
    public ResponseEntity<List<Movie>> getRecommendationsFor(@PathVariable String mood, @RequestParam("movies") String moviesWatched) {
        // Get movies
        List<Movie> recommendations = movieService.getMoviesFor(mood, 5); // Grab 5 for now

        // Filter movies out
        return ResponseEntity.ok(filterMovieList(recommendations, List.of(new Movie())));
    }

    private List<Movie> filterMovieList(List<Movie> movieList, List<Movie> alreadyWatchedList) {
        return List.of(new Movie());
    }
}