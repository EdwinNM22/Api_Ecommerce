package scrum_master.com.e_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.entities.CategoriaEntity;
import scrum_master.com.e_commerce.repository.CategoriaRepository;
import scrum_master.com.e_commerce.service.CategoriaService;

import java.util.List;

@Service
public class CategoriaImpl implements CategoriaService {


    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public CategoriaEntity save(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }
}


