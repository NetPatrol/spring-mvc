package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {

    List<Car> index();

    List<Car> count(String i);

    void addNewCar(Car car);
}
