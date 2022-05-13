package web.carServices;

import web.controller.Car;

import java.util.List;

public interface CarService {
    List<Car> carsCount(List<Car> cars, int count);
}
