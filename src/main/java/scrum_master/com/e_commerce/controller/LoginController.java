package scrum_master.com.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/usuario")
public class LoginController {

    @GetMapping("/login")
    public String vistalogin() {
        return "usuario/login";
    }

    @GetMapping("/registro")
    public String vistaregistro() {
        return "usuario/registro";
    }

    @GetMapping("/edit")
    public String vistaedit() {
        return "usuario/edit";
    }
}




