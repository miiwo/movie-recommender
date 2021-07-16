package movie.recommender.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import movie.recommender.backend.service.UserService;
import movie.recommender.backend.models.User;


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
     *
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok(us.getUserById(1l));
    }

    @PostMapping("/")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        if (us.createUser(user.getEmail(), user.getPassword())) return ResponseEntity.ok("User successfully created");
        System.out.println("I got here");
        return ResponseEntity.badRequest().body("User was not created");
    }

//    @PostMapping("/user")
//    public ResponseEntity<String> createUser(@RequestParam("email") String email, @RequestParam("password") String password) {
//        System.out.println("I got here");
//        if (us.createUser(email, password)) return ResponseEntity.ok("User successfully created");
//        System.out.println("I got here too");
//        return ResponseEntity.badRequest().body("User was not created");
//    }
}