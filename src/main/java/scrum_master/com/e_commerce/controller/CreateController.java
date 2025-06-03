package scrum_master.com.e_commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateController {
    @GetMapping("")
    public String createproducto() {
        return "productos/create";
    }


}
