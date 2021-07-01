package web.service;

import web.model.Car;
import java.util.List;

public interface CarService{

    List<Car> listAllCar();

    List<Car> listSoManyCars(Integer quantity);

    void addNewCar(Car car);
}
