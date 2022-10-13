package develhope.API_05.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class CarDTO {

    @NotBlank(message = "mandatory")
    String id;
    @NotBlank(message = "mandatory")
    String modelname;
    double price;

}
