package movie.recommender.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String email;
    @Column
    private String password;

    public User() {} // Need a default constructor

    public User(String email, String password) {
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
