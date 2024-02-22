package miniblog;

import miniblog.model.entity.User;
import miniblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    /**
     * initializes the user
     */
    @Bean
    @Autowired
    public CommandLineRunner dataLoader(UserRepository userRepository, PasswordEncoder encoder){
        return args -> {
            if (userRepository.count() == 0){
                userRepository.save(new User(0, "admin", encoder.encode("admin")));
            }
        };
    }
}
