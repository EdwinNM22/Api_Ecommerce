package scrum_master.com.e_commerce.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String nombre;
    private String correo;
    private String password;
    private String Celular;

    @ManyToOne
    @JoinColumn(name = "idRol")
    @JsonManagedReference
    private RolEntity rol;

    @OneToMany(mappedBy = "usuario")
    @JsonBackReference
    private List<TiendaEntity> tiendas;


    @OneToMany(mappedBy = "usuario")
    @JsonIgnore // evita recursión si no necesitas mostrar los pedidos desde usuario
    private List<PedidoEntity> pedidos;

    @OneToMany(mappedBy = "usuario")
    @JsonIgnore // igual aquí con facturas
    private List<FacturaEntity> facturas;

}
