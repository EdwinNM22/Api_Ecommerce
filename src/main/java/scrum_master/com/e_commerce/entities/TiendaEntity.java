package scrum_master.com.e_commerce.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Tienda")
public class TiendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idTienda;
    private String nombre;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    @JsonManagedReference
    private UsuarioEntity usuario;

    @OneToMany(mappedBy = "tienda")
    @JsonBackReference
    private List<PedidoEntity> pedidos;
}