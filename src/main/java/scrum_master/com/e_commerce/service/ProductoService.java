package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.DTO.InfoProductoDTO;
import scrum_master.com.e_commerce.entities.ProductoEntity;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<ProductoEntity> findAll();
    ProductoEntity save(ProductoEntity producto);
    Optional<ProductoEntity> findById(Integer id);
    void delete(Integer id);
    void update(ProductoEntity producto);
    List<InfoProductoDTO> obtenerInfoProductos();
}