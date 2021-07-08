package movie.recommender.backend.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String password;

    public User(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // Getters + Setters
    public String getEmail() {
        return this.email;
    }

}
