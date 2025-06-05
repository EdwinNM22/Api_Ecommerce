package scrum_master.com.e_commerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {


    @RequestMapping("")
    public String vistahome(){
        return "home/index";
    }

    @GetMapping("/index") // Redirige a la pagina principal/
    public String mostrarIndex() {
        return "home/index"; // nombre del archivo HTML dentro de tempeeelates/
    }

}
