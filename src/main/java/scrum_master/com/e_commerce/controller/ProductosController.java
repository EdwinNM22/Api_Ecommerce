package scrum_master.com.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController {

    @GetMapping("/productohome")
    public String vistaproducto() {
        return "homeproducto/productohome";
    }

    @GetMapping("/create")
    public String createproducto() {
        return "productcrud/create";
    }

    @GetMapping("/show")
    public String show() {
        return "productcrud/show";
    }

    @GetMapping("/edit")
    public String vistaedit() {
        return "productcrud/edit";
    }
}
