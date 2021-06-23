package web.Services;

import web.model.Car;
import java.util.List;

public interface CarService{

    List<Car> index();

    List<Car> count(String i);

    void addNewCar(Car car);
}
