package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    List<UsuarioEntity> findAll();
    UsuarioEntity save(UsuarioEntity usuario);
}

