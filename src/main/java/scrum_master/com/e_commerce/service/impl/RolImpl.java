package scrum_master.com.e_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.service.RolService;
import scrum_master.com.e_commerce.entities.RolEntity;
import scrum_master.com.e_commerce.repository.RolRepository;

import java.util.List;

@Service
public class RolImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<RolEntity> findAll() {
        return rolRepository.findAll();
    }
    @Override
    public RolEntity save(RolEntity rol) {
        return rolRepository.save(rol);
    }
}
