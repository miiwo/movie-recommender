package movie.recommender.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieId;
    String name;
    //Picture picture
    String description;
    String imdbLink;

    int happyScore;
    int sadScore;
    int funnyScore;

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImdbLink() {
        return imdbLink;
    }

    public void setImdbLink(String imdbLink) {
        this.imdbLink = imdbLink;
    }

    public int getHappyScore() {
        return happyScore;
    }

    public void setHappyScore(int happyScore) {
        this.happyScore = happyScore;
    }

    public int getSadScore() {
        return sadScore;
    }

    public void setSadScore(int sadScore) {
        this.sadScore = sadScore;
    }

    public int getFunnyScore() {
        return funnyScore;
    }

    public void setFunnyScore(int funnyScore) {
        this.funnyScore = funnyScore;
    }
}
