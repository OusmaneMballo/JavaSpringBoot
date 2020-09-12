package cours.java.rh_web_app_spring_boot.Controller;
import cours.java.rh_web_app_spring_boot.DAO.MedecinRepository;
import cours.java.rh_web_app_spring_boot.DAO.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medecin")
public class MedecinController {

    @Autowired
    private MedecinRepository medeciRepos;
    @Autowired
    private ServiceRepository serviceRepo;

    @GetMapping("/all")
    public String medecinPage(Model model) {

        model.addAttribute("services", serviceRepo.findAll());
        model.addAttribute("medecins",medeciRepos.findAll());
        return "medecin";
    }
}
