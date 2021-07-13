package movie.recommender.backend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Holds the table object that maps the relationship between a user and a movie watched
 */
@Entity
@Table(name="movies_watched")
public class MovieUser {
    private long movieId, userId;
}
