package movie.recommender.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class MovieRecommendationController {

    @GetMapping("")
    public ResponseEntity<String> getRecommendationsFor() {
        return ResponseEntity.ok("Hello world");
    }
}