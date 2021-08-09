package backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import backend.service.QuestionnaireService;
import backend.model.Movie;


@RestController
@RequestMapping("/question")
public class QuestionnaireController {

    @Autowired
    private QuestionnaireService qs;

    /**
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<String> getMovieName(@PathVariable int id) {
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