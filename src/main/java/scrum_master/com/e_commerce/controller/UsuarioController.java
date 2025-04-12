package scrum_master.com.e_commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.entities.UsuarioEntity;
import scrum_master.com.e_commerce.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @Transactional(readOnly = true)
    @GetMapping("")
    public List<UsuarioEntity> getUsuarios() {
        return usuarioService.findAll();
    }

    @Transactional
    @PostMapping("")
    public UsuarioEntity addUsuario(@RequestBody UsuarioEntity usuario) {
        return usuarioService.save(usuario);
    }


}
