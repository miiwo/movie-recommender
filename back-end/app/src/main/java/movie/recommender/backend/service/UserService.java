package movie.recommender.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie.recommender.backend.models.User;
import movie.recommender.backend.repository.UserRepository;

/**
 * This is the class that provides logic to interacting with a certain
 * part of the app. For this, a it currently grabs a user by their ID,
 * but more practical methods would be:
 *   - resetPassword(long userID)
 *   - createUser(String name, String password)
 *   - verifyUser (String name, String password)
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Test method to check that the database connection is working
     * Remove later.
     * @param id
     * @return
     */
    public String getUserById(long id) {
        User theUser = this.userRepository.findById(id).get();

        return theUser.getEmail();
    }

    public boolean verifyUser(long id, String password) {
        if (!this.userRepository.findById(id).isPresent()) return false;

        User user = this.userRepository.findById(id).get();
        if (password == user.getPassword()) return true;
        return false;
    }

    public boolean createUser(String email, String password) {
        // generate id
        long id = 45;

        if (this.userRepository.findById(id).isPresent()) return false;

        User user = new User(id, email, password);
        this.userRepository.saveAndFlush(user);
        return true;
    }
}
