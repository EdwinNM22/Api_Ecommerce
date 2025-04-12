package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.CategoriaEntity;
import scrum_master.com.e_commerce.entities.PedidoEntity;

import java.util.List;

public interface CategoriaService {
    List<CategoriaEntity> findAll();
    CategoriaEntity save(CategoriaEntity categoria);

}
