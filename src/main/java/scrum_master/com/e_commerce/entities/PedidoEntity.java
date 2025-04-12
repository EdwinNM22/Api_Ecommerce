package scrum_master.com.e_commerce.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "Pedido")
public class PedidoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    private LocalDate fecha;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "IdUsuario")
    @JsonManagedReference

    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "idTienda")
    @JsonManagedReference
    private TiendaEntity tienda;

    @OneToMany(mappedBy = "pedido")
    @JsonIgnore
    private List<DetallepEntity> detalles;

    @OneToOne(mappedBy = "pedido")
    @JsonIgnore
    private FacturaEntity factura;

}
