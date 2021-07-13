package movie.recommender.backend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Holds the table object that maps the relation between movie and mood.
 */
@Entity
@Table(name = "movie_mood")
public class MovieMood {
    private long movieID;
    private long happyScore, sadScore, funnyScore;
}
