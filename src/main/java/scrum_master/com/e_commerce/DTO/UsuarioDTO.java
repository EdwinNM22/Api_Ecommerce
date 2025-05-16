package scrum_master.com.e_commerce.DTO;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String celular;
    private int idRol;
    private String nombreRol;
}
