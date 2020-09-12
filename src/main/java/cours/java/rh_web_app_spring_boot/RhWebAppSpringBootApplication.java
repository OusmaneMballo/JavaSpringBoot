package cours.java.rh_web_app_spring_boot;

import cours.java.rh_web_app_spring_boot.DAO.SpecialiteRepository;
import cours.java.rh_web_app_spring_boot.model.Specialite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RhWebAppSpringBootApplication implements CommandLineRunner {

    @Autowired
    private SpecialiteRepository specialiteRepo;
    public static void main(String[] args) {
        SpringApplication.run(RhWebAppSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Specialite specialite=new Specialite();
        specialite.setLibelle("Specialite 1");
        specialiteRepo.save(specialite);*/
    }
}
