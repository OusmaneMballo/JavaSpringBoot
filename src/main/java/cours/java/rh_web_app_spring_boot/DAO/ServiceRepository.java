package cours.java.rh_web_app_spring_boot.DAO;
import cours.java.rh_web_app_spring_boot.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer>{

}