package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
