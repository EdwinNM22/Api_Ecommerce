package scrum_master.com.e_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.service.TiendaService;
import scrum_master.com.e_commerce.entities.TiendaEntity;
import scrum_master.com.e_commerce.repository.TiendaRepository;

import java.util.List;

@Service
public class TiendaImpl implements TiendaService {

    @Autowired
    private TiendaRepository tiendaRepository;

    @Override
    public List<TiendaEntity> findAll() {
        return tiendaRepository.findAll();
    }
    @Override
    public TiendaEntity save(TiendaEntity tienda) {
        return tiendaRepository.save(tienda);
    }
}
