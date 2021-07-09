package movie.recommender.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String email;

    private String password;

    public User() {} // Need a default constructor

    public User(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // Getters + Setters
    public String getEmail() {
        return this.email;
    }

    public long getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }

}
