package scrum_master.com.e_commerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scrum_master.com.e_commerce.entities.PedidoEntity;
import scrum_master.com.e_commerce.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("")
    public List<PedidoEntity> getPedidos() {
        return pedidoService.findAll();
    }


    @PostMapping("")
    public PedidoEntity addPedido(@RequestBody PedidoEntity pedido) {
        return pedidoService.save(pedido);
    }
}

