package movie.recommender.backend.model;


public class MovieUser extends User {

    //@Transient
    //private List<String> moviesWatched;
    
    public MovieUser(String email, String password) {
        super(email, password);
    }
    
}
