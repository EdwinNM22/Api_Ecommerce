package scrum_master.com.e_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.entities.DetallepEntity;
import scrum_master.com.e_commerce.repository.DetallepRepository;
import scrum_master.com.e_commerce.service.DetallepService;

import java.util.List;

@Service
public class DetallepImpl implements DetallepService {


    @Autowired
    DetallepRepository detallepRepository;

    @Override
    public List<DetallepEntity> findAll() {
        return detallepRepository.findAll();
    }

    @Override
    public DetallepEntity save(DetallepEntity detallep) {
        return detallepRepository.save(detallep);
    }
}
