package scrum_master.com.e_commerce.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @GetMapping("/shop")
    public String vistatienda() {
        return "tienda/shop";
    }

    @GetMapping("/shopregistro")
    public String tiendaregistro() {
        return "tienda/shopregistro";
    }
/*Endpoint de Inforproducto*/
    @GetMapping("/infopro")
    public String infopro() {
        return "infop/infopro";
    }
}

