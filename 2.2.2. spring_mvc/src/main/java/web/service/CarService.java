package web.service;

import web.model.Car;
import java.util.List;

public interface CarService{

    List<Car> listAllCar();

    List<Car> listCountCars(Integer quantity);

    void addNewCar(Car car);
}
