package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.TiendaEntity;

import java.util.List;
import java.util.Optional;

public interface TiendaService {

    List<TiendaEntity> findAll();
    TiendaEntity save(TiendaEntity tienda);
    Optional<TiendaEntity> findById(Integer id);
    void delete(Integer tienda);
    void update(TiendaEntity tienda);

}
