package develhope.API_05.controller;
import develhope.API_05.dto.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class CarController {

    @GetMapping("cars")
    public CarDTO getCar() {
        return new CarDTO("A156", "GT86", 30000);
    }

    @PostMapping("cars")
    @ResponseStatus(HttpStatus.CREATED)
    public String PostCar(@Valid @RequestBody CarDTO car) {

        return car.toString();

    }
}
