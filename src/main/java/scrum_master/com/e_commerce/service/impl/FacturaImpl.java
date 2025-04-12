package scrum_master.com.e_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.entities.FacturaEntity;
import scrum_master.com.e_commerce.repository.FacturaRepository;
import scrum_master.com.e_commerce.service.FacturaService;

import java.util.List;

@Service
public class FacturaImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;


    @Override
    public List<FacturaEntity> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public FacturaEntity save(FacturaEntity factura) {
        return facturaRepository.save(factura);
    }
}
