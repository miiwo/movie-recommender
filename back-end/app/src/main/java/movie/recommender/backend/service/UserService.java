package movie.recommender.backend.service;

import java.util.List;

import movie.recommender.backend.model.dto.Movie;


/**
 * Currently an interface until we get the implementation completed on the other end.
 */
public interface UserService {
    boolean verifyUser(String user);
    List<Movie> getMoviesFor(String user);
}
