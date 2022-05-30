package web.carServices;


import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> createCarList();
    List<Car> carsCount(List<Car> cars, int count);
}
