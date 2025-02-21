package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {

    List<Car> listAllCar();

    List<Car> listCountCars(Integer quantity);

    void addNewCar(Car car);
}
