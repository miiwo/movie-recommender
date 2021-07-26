package movie.recommender.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import movie.recommender.backend.service.QuestionnaireService;
import movie.recommender.backend.models.Movie;


@RestController
@RequestMapping("/question")
public class QuestionnaireController {

    @Autowired
    private QuestionnaireService qs;

    /**
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<String> getMovieName(@RequestParam int id) {
        return ResponseEntity.ok(qs.getMovieById(id).getName());
    }

    @PostMapping("/")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
        qs.createMovie(movie.getName(),movie.getDescription(),movie.getImdbLink());
        return ResponseEntity.ok("Movie added");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateMovie(@RequestParam int id, int happyScore, int sadScore, int funnyScore) {
        qs.updateMovieScores(id, happyScore, sadScore, funnyScore);
        return ResponseEntity.ok("Scores updated");
    }
}