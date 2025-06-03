package scrum_master.com.e_commerce.controller2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.entities.FacturaEntity;
import scrum_master.com.e_commerce.service.FacturaService;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {


    @Autowired
    private FacturaService facturaService;

    @GetMapping("")
    public List<FacturaEntity>getFacturas() {
        return facturaService.findAll();
    }


    @PostMapping("")
    public FacturaEntity addFactura(@RequestBody FacturaEntity factura) {
        return facturaService.save(factura);
    }
}
