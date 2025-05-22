package scrum_master.com.e_commerce.DTO.Payload;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoMessage {

    private String message;
    private Object data;

}
