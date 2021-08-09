package movie.recommender.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import movie.recommender.backend.models.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query("UPDATE movie SET movie.happyScore = ?1, movie.sadScore =?2, movie.funnyScore =?3 WHERE movie.movieId = ?4 ")
    void updateMovieScores(int happyScore, int sadScore, int funnyScore, long movieId);
}