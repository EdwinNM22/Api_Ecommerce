package scrum_master.com.e_commerce.DTO;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InfoProductoDTO {


    private String nombre;
    private int stock;
    private String estado_stock;
}


