package scrum_master.com.e_commerce.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum_master.com.e_commerce.DTO.InfoProductoDTO;
import scrum_master.com.e_commerce.entities.ProductoEntity;

import scrum_master.com.e_commerce.repository.ProductoRepository;
import scrum_master.com.e_commerce.service.ProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;


    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }
    @Override
    public Optional<ProductoEntity> findById(Integer id) {
        return productoRepository.findById(id);
    }
    @Override
    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }
    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);

    }
    @Override
    public void update(ProductoEntity producto) {
        productoRepository.save(producto);

    }
    @Override
    public List<InfoProductoDTO> obtenerInfoProductos() {
        return productoRepository.obtenerInfoProductos();
    }
}
