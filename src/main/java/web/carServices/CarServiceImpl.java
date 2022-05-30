package web.carServices;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    public List<Car> createCarList() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Nissan", 6485, "01AB1468"));
        cars.add(new Car("KIA", 6879, "02CD5486"));
        cars.add(new Car("Hyundai", 6548, "03EF1223"));
        cars.add(new Car("Toyota", 3453, "04GH7877"));
        cars.add(new Car("Toyota", 7769, "05IJ7789"));
        return cars;
    }

    public List<Car> carsCount(List<Car> cars, int count) {
        if (count == 0 || count > 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
