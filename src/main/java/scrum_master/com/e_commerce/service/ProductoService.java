package scrum_master.com.e_commerce.service;

import scrum_master.com.e_commerce.DTO.InfoProductoDTO;
import scrum_master.com.e_commerce.entities.ProductoEntity;

import java.util.List;

public interface ProductoService {

    List<ProductoEntity> findAll();
    ProductoEntity save(ProductoEntity producto);

    List<InfoProductoDTO> obtenerInfoProductos();

}
