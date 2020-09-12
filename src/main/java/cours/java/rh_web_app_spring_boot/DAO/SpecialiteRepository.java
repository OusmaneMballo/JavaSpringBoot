package cours.java.rh_web_app_spring_boot.DAO;
import cours.java.rh_web_app_spring_boot.model.Service;
import cours.java.rh_web_app_spring_boot.model.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Integer>{
    public  List<Specialite> findByService_Id(int id);
    //public List<Specialite> findByService_Libelle(Service s, String libelle);
}