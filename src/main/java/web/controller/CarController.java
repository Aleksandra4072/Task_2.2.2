package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.carServices.CarService;
import web.carServices.CarServiceImpl;
import web.model.Car;
import java.util.List;


@Controller
public class CarController {

    @RequestMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count",defaultValue = "5") int count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.createCarList();
        if(count < 0) {
            throw new NullPointerException();
        } else {
            cars = carService.carsCount(cars, count);
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}
