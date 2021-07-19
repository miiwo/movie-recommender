package movie.recommender.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import movie.recommender.backend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {}