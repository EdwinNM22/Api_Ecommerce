package scrum_master.com.e_commerce.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Detalle")
public class DetallepEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalle;
    private int cantidad;
    private double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    @JsonBackReference
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    @JsonBackReference
    private ProductoEntity producto;
}
