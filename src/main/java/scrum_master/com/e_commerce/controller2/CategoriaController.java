package scrum_master.com.e_commerce.controller2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.entities.CategoriaEntity;
import scrum_master.com.e_commerce.service.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {


    @Autowired
    private CategoriaService categoriaService;

    @Transactional(readOnly = true)
    @GetMapping("")
    public List<CategoriaEntity> getCategoria() {
        return  categoriaService.findAll();
    }
    @Transactional
    @PostMapping("")
    public CategoriaEntity addCategoria(@RequestBody CategoriaEntity categoria) {
        return categoriaService.save(categoria);
    }
}
