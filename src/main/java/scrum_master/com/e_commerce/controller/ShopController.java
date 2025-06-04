package scrum_master.com.e_commerce.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Tienda")
public class ShopController {
    @GetMapping("/shop")
    public String vistatienda() {
        return "tienda/shop";
    }

    @GetMapping("/shopregistro")
    public String tiendaregistro() {
        return "tienda/shopregistro";
    }

}

