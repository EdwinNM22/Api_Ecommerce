package scrum_master.com.e_commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.entities.TiendaEntity;
import scrum_master.com.e_commerce.service.TiendaService;

import java.util.List;

@RestController
@RequestMapping("/tienda")
public class TiendaController {


    @Autowired
    private TiendaService tiendaService;

    @Transactional(readOnly = true)
    @GetMapping("")
    public List<TiendaEntity> getTiendas() {
        return tiendaService.findAll();
    }


    @Transactional
    @PostMapping("")
    public TiendaEntity addTienda(@RequestBody TiendaEntity tienda) {
        return tiendaService.save(tienda);
    }
}
