package movie.recommender.backend.models;

import java.util.List;
import javax.persistence.Transient;


public class MovieUser extends User {

    //@Transient
    //private List<String> moviesWatched;
    
    public MovieUser(long id, String email, String password) {
        super(id, email, password);
    }
    
}