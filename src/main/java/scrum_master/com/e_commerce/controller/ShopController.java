package scrum_master.com.e_commerce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import scrum_master.com.e_commerce.entities.ProductoEntity;
import scrum_master.com.e_commerce.entities.TiendaEntity;
import scrum_master.com.e_commerce.entities.UsuarioEntity;
import scrum_master.com.e_commerce.service.ProductoService;
import scrum_master.com.e_commerce.service.TiendaService;
import scrum_master.com.e_commerce.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/tienda")
public class ShopController {

    @Autowired
    private TiendaService tiendaService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/show")
    public String vistatienda(Model model) {
        List<TiendaEntity> tienda = tiendaService.findAll();
        model.addAttribute("tienda", tienda);
        return "tienda/show";
    }

    @GetMapping("/create")
    public String CrearTienda(Model model) {
        model.addAttribute("tienda", new TiendaEntity());
        return "tienda/create";
    }

        /*Endpoint de Inforproducto*/
    @GetMapping("/infopro")
    public String infopro() {
        return "infop/infopro";
    }



    //---------------------METODOS HTTP---------------------------------------
    @PostMapping("/save")
    public String savetienda(@ModelAttribute TiendaEntity tienda) {

        Optional<UsuarioEntity> optionalUsuario = usuarioService.findByEmail(
                SecurityContextHolder.getContext().getAuthentication().getName()
        );

        if (optionalUsuario.isEmpty()) {
            return "redirect:/auth/login";  // No logueado o usuario no encontrado
        }

        UsuarioEntity usuario = optionalUsuario.get();
        tienda.setUsuario(usuario); // Asocia usuario actual a la tienda
        tiendaService.save(tienda); // Guarda la tienda con usuario

        return "redirect:/tienda/show";
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

