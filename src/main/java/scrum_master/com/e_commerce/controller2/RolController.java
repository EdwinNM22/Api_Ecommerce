package scrum_master.com.e_commerce.controller2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.entities.RolEntity;
import scrum_master.com.e_commerce.service.RolService;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @Transactional(readOnly = true)
    @GetMapping("")
    public List<RolEntity> getRols() {
        return rolService.findAll();
    }

    @Transactional
    @PostMapping("  ")
    public RolEntity addRol(@RequestBody RolEntity rol) {
       return rolService.save(rol);
    }

}
