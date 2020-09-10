package cours.java.rh_web_app_spring_boot.DAO;

import cours.java.rh_web_app_spring_boot.model.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}