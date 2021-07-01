package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {

    List<Car> listAllCar();

    List<Car> ShowSoManyCars(Integer quantity);

    void addNewCar(Car car);
}
