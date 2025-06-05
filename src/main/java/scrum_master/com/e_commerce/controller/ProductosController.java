package scrum_master.com.e_commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import scrum_master.com.e_commerce.entities.ProductoEntity;
import scrum_master.com.e_commerce.service.ProductoService;

import java.util.List;

@Controller
@RequestMapping("/producto")
public class ProductosController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/show")
    public String show(Model model) {
        List<ProductoEntity> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        return "producto/show";
    }

    @GetMapping("/create")
    public String createproducto(Model model) {
        model.addAttribute("producto", new ProductoEntity());
        return "producto/create";
    }

    @GetMapping("/edit")
    public String vistaedit() {
        return "producto/edit";
    }


    //---------------------METODOS HTTP---------------------------------------
    @PostMapping("/save")
    public String saveProducto(@ModelAttribute ProductoEntity producto) {
        productoService.save(producto);
        return "redirect:/producto/create";
    }

    @PostMapping("/update")
    public String updateProducto(@ModelAttribute ProductoEntity producto) {
        productoService.update(producto);
        return "redirect:/producto/show";
    }

    @GetMapping("/edit/{id}")
    public String editProducto(@PathVariable Integer id, Model model) {
        ProductoEntity producto = productoService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("producto", producto);
        return "producto/edit";
    }


    @PostMapping("/delete/{id}")
    public String deleteProducto(@PathVariable Integer id) {
        productoService.delete(id);
        return "redirect:/producto/show";

    }
}
