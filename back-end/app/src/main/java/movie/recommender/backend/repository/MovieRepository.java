package movie.recommender.backend.repository;

import org.springframework.data.repository.CrudRepository;
import movie.recommender.backend.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {}
