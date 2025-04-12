package scrum_master.com.e_commerce.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.entities.ProductoEntity;

import scrum_master.com.e_commerce.repository.ProductoRepository;
import scrum_master.com.e_commerce.service.ProductoService;

import java.util.List;

@Service
public class ProductoImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;


    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }
    @Override
    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }
}
