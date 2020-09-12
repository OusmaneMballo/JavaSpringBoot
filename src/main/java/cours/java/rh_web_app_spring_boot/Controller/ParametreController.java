package cours.java.rh_web_app_spring_boot.Controller;


import cours.java.rh_web_app_spring_boot.DAO.ServiceRepository;
import cours.java.rh_web_app_spring_boot.DAO.SpecialiteRepository;
import cours.java.rh_web_app_spring_boot.model.Specialite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/param")
public class ParametreController {
    @Autowired
    private SpecialiteRepository specialiteRepo;

    @GetMapping("/service/{id}")
    public @ResponseBody List<Specialite> specialiteById(@PathVariable(name= "id" ) int idService){
        return specialiteRepo.findByService_Id(idService);
    }

}
