package movie.recommender.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import movie.recommender.backend.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
