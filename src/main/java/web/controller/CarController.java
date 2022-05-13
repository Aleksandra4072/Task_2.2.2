package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.carServices.CarService;
import web.carServices.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @RequestMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count",defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Nissan", 6485, "01AB1468"));
        cars.add(new Car("KIA", 6879, "02CD5486"));
        cars.add(new Car("Hyundai", 6548, "03EF1223"));
        cars.add(new Car("Toyota", 3453, "04GH7877"));
        cars.add(new Car("Toyota", 7769, "05IJ7789"));
        CarService carService = new CarServiceImpl();
        cars = carService.carsCount(cars, count);
        model.addAttribute("cars", cars);
        System.out.println();

        return "cars";
    }
}
