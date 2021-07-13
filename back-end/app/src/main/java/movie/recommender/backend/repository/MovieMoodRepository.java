package movie.recommender.backend.repository;

import org.springframework.stereotype.Repository;

import movie.recommender.backend.model.MovieMood;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface MovieMoodRepository extends CrudRepository<MovieMood, Long> {

    List<MovieMood> findAllMoviesThatAre(String mood);
    
}
