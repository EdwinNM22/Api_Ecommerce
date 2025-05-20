package scrum_master.com.e_commerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.DTO.InfoProductoDTO;
import scrum_master.com.e_commerce.entities.ProductoEntity;
import scrum_master.com.e_commerce.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Transactional(readOnly = true)
    @GetMapping("")
    public List<ProductoEntity> getProductos() {
        return productoService.findAll();
    }

    @Transactional
    @PostMapping("")
    public ProductoEntity addProducto(@RequestBody ProductoEntity producto) {
        return productoService.save(producto);
    }


    @Transactional(readOnly = true)
    @GetMapping("/info")
    public List<InfoProductoDTO> getInfoProductosConEstadoStock() {
        return productoService.obtenerInfoProductos();
    }
}
