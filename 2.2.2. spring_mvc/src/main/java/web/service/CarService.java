package web.service;

import web.model.Car;
import java.util.List;

public interface CarService{

    List<Car> listAllCar();

    List<Car> ShowSoManyCars(Integer quantity);

    void addNewCar(Car car);
}
