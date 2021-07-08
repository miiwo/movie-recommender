package movie.recommender.backend.repository;

import org.springframework.data.repository.CrudRepository;
import movie.recommender.backend.models.User;

public interface UserRepository extends CrudRepository<User, Long> {}
