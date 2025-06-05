package scrum_master.com.e_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.service.TiendaService;
import scrum_master.com.e_commerce.entities.TiendaEntity;
import scrum_master.com.e_commerce.repository.TiendaRepository;

import java.util.List;
import java.util.Optional;

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


    @Override
    public Optional<TiendaEntity> findById(Integer id) {
        return tiendaRepository.findById(id);
    }

    @Override
    public void delete(Integer tienda) {
        tiendaRepository.deleteById(tienda);
    }


    @Override
    public void update(TiendaEntity tienda) {
        tiendaRepository.save(tienda);

    }
}
