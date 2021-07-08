package movie.recommender.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import movie.recommender.backend.repository.UserRepository;

@SpringBootApplication
public class App {
    public String getGreeting() {


        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
