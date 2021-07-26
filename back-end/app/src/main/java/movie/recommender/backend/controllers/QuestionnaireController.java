package movie.recommender.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import movie.recommender.backend.service.QuestionnaireService;


@RestController
@RequestMapping("/question")
public class QuestionnaireController {

    @Autowired
    private QuestionnaireService qs;

    /**
     * This is mapping to the root path, or localhost:8080/
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok(qs.getMovieById(1l));
    }

}