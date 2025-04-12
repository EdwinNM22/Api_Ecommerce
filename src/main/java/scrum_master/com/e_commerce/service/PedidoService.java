package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.PedidoEntity;

import java.util.List;

public interface PedidoService {

    List<PedidoEntity> findAll();
    PedidoEntity save(PedidoEntity pedido);
}
