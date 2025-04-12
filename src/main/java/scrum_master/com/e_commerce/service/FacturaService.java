package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.FacturaEntity;

import java.util.List;

public interface FacturaService {

    List<FacturaEntity> findAll();
    FacturaEntity save(FacturaEntity factura);
}
