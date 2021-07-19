package movie.recommender.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import movie.recommender.backend.repository.UserRepository;

@SpringBootApplication
public class App {

    @Autowired
    UserRepository ur;

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    // This is a test method to show that the app is connected to the back end. Please ensure you have an entry with id 1 in your user table.
    // Also edit application.properties to your user/pass combo for your sql.
    @Bean
    public CommandLineRunner cmlr(ApplicationContext ctx) {
        return args -> {
            System.out.println("running");
        };
    }
}
