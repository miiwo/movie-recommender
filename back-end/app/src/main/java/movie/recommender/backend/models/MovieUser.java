package movie.recommender.backend.models;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Table;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(appliesTo = "user")
public class MovieUser extends User {

    public MovieUser(long id, String email, String password) {
        super(id, email, password);
    }
    
}
