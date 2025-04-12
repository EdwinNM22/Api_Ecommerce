package scrum_master.com.e_commerce.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Factura")
public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactura;
    private LocalDate fechaEmision;
    private double total;

    @OneToOne
    @JoinColumn(name = "idPedido")
    @JsonManagedReference
    private PedidoEntity pedido;

    @ManyToOne
    @JoinColumn(name = "IdUsuario")
    @JsonIgnore
    private UsuarioEntity usuario;

}
