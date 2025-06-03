package scrum_master.com.e_commerce.controller2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.entities.DetallepEntity;
import scrum_master.com.e_commerce.service.DetallepService;

import java.util.List;

@RestController
@RequestMapping("/detallep")
public class DetallepController {

    @Autowired
    private DetallepService detallepService;

    @Transactional(readOnly = true)
    @GetMapping("")
    public List<DetallepEntity> getDetallep() {
        return detallepService.findAll();
    }
    @Transactional
    @PostMapping("")
    public DetallepEntity save(@RequestBody DetallepEntity pedidop) {
        return detallepService.save(pedidop);
    }
}
