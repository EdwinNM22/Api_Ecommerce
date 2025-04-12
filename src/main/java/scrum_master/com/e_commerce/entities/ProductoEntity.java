package scrum_master.com.e_commerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Producto")
public class ProductoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    @JsonManagedReference
    private CategoriaEntity categoria;


    @OneToMany(mappedBy = "producto")
    @JsonIgnore
    private List<DetallepEntity> detalles;

}
