package cours.java.rh_web_app_spring_boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RhWebAppSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RhWebAppSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
