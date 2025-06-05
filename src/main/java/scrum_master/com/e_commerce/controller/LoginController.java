package scrum_master.com.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import scrum_master.com.e_commerce.entities.UsuarioEntity;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @GetMapping("/login")
    public String vistalogin() {
        return "auth/login";
    }

    @GetMapping("/registro")
    public String vistaregistro(Model model) {
        model.addAttribute("usuario", new UsuarioEntity());
        return "auth/registro";
    }
}





