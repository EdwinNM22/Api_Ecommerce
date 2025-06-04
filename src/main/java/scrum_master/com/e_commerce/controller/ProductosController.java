package scrum_master.com.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Productos")
public class ProductosController {

    @GetMapping("/productohome")
    public String vistaproducto() {
        return "producto/productohome";
    }

    @GetMapping("/create")
    public String createproducto() {
        return "producto/create";
    }

    @GetMapping("/show")
    public String show() {
        return "producto/show";
    }

    @GetMapping("/edit")
    public String vistaedit() {
        return "producto/edit";
    }

    /*Endpoint de Infoproducto*/
    @GetMapping("/infopro")
    public String infopro() {
        return "producto/infopro";
    }
}
