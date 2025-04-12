package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.TiendaEntity;

import java.util.List;

public interface TiendaService {

    List<TiendaEntity> findAll();
    TiendaEntity save(TiendaEntity tienda);
}
