package movie.recommender.backend.model.dto;

/**
 * The DTO class to send back to the front-end or client.
 */
public class Movie {
    private long movieId;

    private String name;
    private String description;
    private String imdbLink;
    //Picture picture

    private int happyScore, sadScore, funnyScore;

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
