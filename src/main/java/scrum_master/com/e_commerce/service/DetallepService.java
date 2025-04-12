package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.DetallepEntity;
import scrum_master.com.e_commerce.entities.PedidoEntity;

import java.util.List;

public interface DetallepService {

    List<DetallepEntity> findAll();
    DetallepEntity save(DetallepEntity detallep);

}
