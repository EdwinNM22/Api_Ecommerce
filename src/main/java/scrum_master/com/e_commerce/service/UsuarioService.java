package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.entities.UsuarioEntity;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<UsuarioEntity> findAll();
    UsuarioEntity save(UsuarioEntity usuario);

    Optional<UsuarioEntity> findById(Integer id);
    Optional<UsuarioEntity> findByEmail(String email);
    public Optional<UsuarioEntity> get(Integer id);
    public void update(UsuarioEntity usuario);
    public void delete(Integer id);

}

