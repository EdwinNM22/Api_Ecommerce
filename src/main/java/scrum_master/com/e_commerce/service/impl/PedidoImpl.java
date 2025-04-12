package scrum_master.com.e_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.entities.PedidoEntity;
import scrum_master.com.e_commerce.repository.PedidoRepository;
import scrum_master.com.e_commerce.service.PedidoService;

import java.util.List;

@Service
public class PedidoImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    @Override
    public List<PedidoEntity> findAll() {
        return pedidoRepository.findAll();
    }
    @Override
    public PedidoEntity save(PedidoEntity pedido) {
        return pedidoRepository.save(pedido);
    }
}
