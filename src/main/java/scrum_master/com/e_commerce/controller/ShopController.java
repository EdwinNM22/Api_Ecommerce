package scrum_master.com.e_commerce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import scrum_master.com.e_commerce.entities.ProductoEntity;
import scrum_master.com.e_commerce.entities.TiendaEntity;
import scrum_master.com.e_commerce.service.ProductoService;
import scrum_master.com.e_commerce.service.TiendaService;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private TiendaService tiendaService;

    @GetMapping("")
    public String vistatienda(Model model) {
        List<TiendaEntity> tienda = tiendaService.findAll();
        model.addAttribute("tienda", tienda);
        return "tienda/show";
    }

    @GetMapping("/registro")
    public String tiendaregistro() {
        return "tienda/registro";
    }

        /*Endpoint de Inforproducto*/
    @GetMapping("/infopro")
    public String infopro() {
        return "infop/infopro";
    }

    //---------------------METODOS HTTP---------------------------------------
    @PostMapping("/save")
    public String saveProducto(@ModelAttribute TiendaEntity tienda) {

        tiendaService.save(tienda);
        return "redirect:/tienda/create";
    }

    @PostMapping("/update")
    public String updatetienda(@ModelAttribute TiendaEntity tienda) {

        tiendaService.update(tienda);
        return "redirect:/tienda/show";
    }

    @GetMapping("/edit/{id}")
    public String edittienda(@PathVariable Integer id, Model model) {
        TiendaEntity tienda = tiendaService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("tienda", tienda);
        return "tienda/edit";
    }


    @PostMapping("/delete/{id}")
    public String deletetienda(@PathVariable Integer id) {

        tiendaService.delete(id);
        return "redirect:/tienda/show";

    }
}

