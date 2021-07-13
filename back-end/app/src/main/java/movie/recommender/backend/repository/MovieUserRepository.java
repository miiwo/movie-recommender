package movie.recommender.backend.repository;

import org.springframework.stereotype.Repository;

import movie.recommender.backend.model.MovieUser;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface MovieUserRepository extends CrudRepository<MovieUser, Long>{
    
}
