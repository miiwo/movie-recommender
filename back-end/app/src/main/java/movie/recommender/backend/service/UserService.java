package movie.recommender.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie.recommender.backend.models.User;
import movie.recommender.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void getUserById(long id) {
        User theUser = this.userRepository.findById(id).get();

        System.out.println(theUser.getEmail());
    }
}
