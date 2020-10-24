package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.ArrayList;
import java.util.List;

@Controller

public class CarsController {

    @GetMapping(value = "cars")
    public String printAllCars(ModelMap model,
                               @RequestParam(name = "count", required = false, defaultValue = "5") int count) {

        List<String> cars = new ArrayList<>();
        CarService service = new CarService();
        if (count > service.count()){
            count = 5;
        }
        for (int i = 0; i < count; i++){
            cars.add(Car.listOfCars.get(i).toString());
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
