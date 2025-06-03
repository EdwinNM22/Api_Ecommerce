package scrum_master.com.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController {

    @GetMapping("/productohome")
    public String vistaproducto() {
        return "homeproducto/productohome";
    }

    @GetMapping("/index") // Redirige a la pagina principal/
    public String mostrarIndex() {
        return "home/index"; // nombre del archivo HTML dentro de templates/
    }

}
