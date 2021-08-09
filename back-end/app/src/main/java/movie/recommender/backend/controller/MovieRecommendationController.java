package movie.recommender.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import movie.recommender.backend.model.dto.Movie;
import movie.recommender.backend.models.User;
import movie.recommender.backend.service.MovieService;
import movie.recommender.backend.service.UserService;

/**
 * TODO: Consider making 2 movie service method calls for a list, and without a list.
 */
@RestController
@RequestMapping("/recommendations")
public class MovieRecommendationController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private MovieService movieService;

    /**
     * Method that returns a bunch of Movie objects to the user in JSON format
     * that it recommends based off of mood. This is for a user.
     * 
     * @return List of Movies
     */
    @GetMapping("/mood/{mood}")
    public ResponseEntity<List<Movie>> getRecommendationsFor(@PathVariable String mood, @RequestParam("user") Optional<User> user) {
        List<Integer> recommendations;

        // Get a list of movies that are deemed "whatever emotion" was requested
        recommendations = movieService.getMoviesFor(mood, 5); // Grab 5 for now

        // Request param User?
        if (user.isPresent()) {
            // Verify user
            if(userService.verifyUser(user.get().getId(), user.get().getPassword())) { // Make the method signature of verify user to be User object
                // Get list of movies a user has watched (Discuss whether this should be in User or Movie)
                List<Integer> userWatchedList = userService.getMoviesFor(user.get());

                // Filter out movies / get more if client has watched some already
                filterMovieList(recommendations, userWatchedList);
            }
        }

        // Construct movie objects
        List<Movie> movieRecommendations = movieService.buildMoviesOn(recommendations);
        
        // Return the recommendations
        return ResponseEntity.ok(movieRecommendations);
    }

    /**
     * This is when given a list of movies.
     * Use case for no users option.
     * @param mood
     * @param moviesWatched
     * @return
     */
    @GetMapping("/mood/{mood}")
    public ResponseEntity<List<Movie>> getRecommendationsFor(@PathVariable String mood, @RequestParam("movies") List<Movie> moviesWatched) {
        // Get movies
        //List<Movie> recommendations = movieService.getMoviesFor(mood, 5); // Grab 5 for now

        // Filter movies out before sending back to client
        //return ResponseEntity.ok(filterMovieList(recommendations, moviesWatched));
        return ResponseEntity.ok().build();
    }

    private List<Movie> filterMovieList(List<Integer> movieList, List<Integer> alreadyWatchedList) {
        return List.of(new Movie());
    }
    
}