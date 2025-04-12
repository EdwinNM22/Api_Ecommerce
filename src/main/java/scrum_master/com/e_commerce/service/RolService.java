package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.RolEntity;
import java.util.List;

public interface RolService {

    List<RolEntity> findAll();
    RolEntity save(RolEntity rol);
}

