package web.carServices;

import web.controller.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    public List<Car> carsCount(List<Car> cars, int count) {
        if (count == 0 || count > 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
