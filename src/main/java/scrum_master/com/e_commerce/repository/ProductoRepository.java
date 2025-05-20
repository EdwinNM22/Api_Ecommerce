package scrum_master.com.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import scrum_master.com.e_commerce.DTO.InfoProductoDTO;
import scrum_master.com.e_commerce.entities.ProductoEntity;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {

    @Query("""
       SELECT new scrum_master.com.e_commerce.DTO.InfoProductoDTO(
           p.nombre, 
           p.stock, 
           CASE 
               WHEN p.stock <= 10 THEN 'Bajo' 
               WHEN p.stock <= 50 THEN 'Medio' 
               ELSE 'Alto' 
           END)
       FROM ProductoEntity p
       """)
    List<InfoProductoDTO> obtenerInfoProductos();

}
