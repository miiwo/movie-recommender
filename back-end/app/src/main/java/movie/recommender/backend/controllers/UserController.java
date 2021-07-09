package movie.recommender.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import movie.recommender.backend.service.UserService;


/**
 * Controller classes will hold the url paths for the app to be accessed by, and
 * the business facing logic to fulfilling a client/consumer's request.
 * These kind of classes should only hold service calls.
 */
@RestController
public class UserController {

    @Autowired
    private UserService us;

    /**
     * This is mapping to the root path, or localhost:8080/
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok(us.getUserById(1l));
    }

}