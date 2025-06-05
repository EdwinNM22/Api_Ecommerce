package scrum_master.com.e_commerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import scrum_master.com.e_commerce.entities.UsuarioEntity;
import scrum_master.com.e_commerce.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/create")
    public String showRegistroForm(Model model) {
        model.addAttribute("usuario", new UsuarioEntity());
        return "auth/registro";
    }

    @PostMapping("/save")
    public String saveUsuario(@ModelAttribute UsuarioEntity usuario, Model model) {
        System.out.println("Guardando usuario: " + usuario.getEmail());
        if (usuarioService.findByEmail(usuario.getEmail()).isPresent()) {
            model.addAttribute("error", "El email ya está registrado");
            return "auth/registro";
        }

        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        // Asignar rol directamente
        usuario.setRol("USER");

        usuarioService.save(usuario);
        return "redirect:/auth/login";
    }



    @GetMapping("/edit/{id}")
    public String editUsuario(@PathVariable Integer id, Model model) {
        UsuarioEntity usuario = usuarioService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("usuario", usuario);
        return "usuarios/edit";
    }

    @PostMapping("/update")
    public String updateUsuario(@ModelAttribute UsuarioEntity usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword())); // Opcional: solo si se quiere actualizar
        usuarioService.update(usuario);
        return "redirect:/usuarios/list";
    }

    @PostMapping("/delete/{id}")
    public String deleteUsuario(@PathVariable Integer id) {
        usuarioService.delete(id);
        return "redirect:/usuarios/list";
    }

    @GetMapping("/list")
    public String listUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.findAll());
        return "usuarios/list";
    }
}
