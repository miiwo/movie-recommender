package movie.recommender.backend.model.dto;

import java.util.List;

/**
 * Convenience DTO class for the middle/back of the backend.
 * Consolidates/aggregates user ids in MovieUser into one property,
 * and contains a list of all the movies that are attached to it.
 */
public class UserMovies {
    private long userId;
    private List<Long> moviesWatched; // Long for the movieID, if want to contain the entire movie object, replace as necessary.
}
