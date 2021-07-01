package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static int COUNT = 0;
    private static final List<Car> cars;


    static {
        cars = new ArrayList<>();
        cars.add(new Car(++COUNT, "BMV", "красный", "BMV1123456TY78DFA"));
        cars.add(new Car(++COUNT, "Cadillac", "черный", "CDL1123456TY78DDA"));
        cars.add(new Car(++COUNT, "Mitsubishi", "серый металлик", "MTB1123456TY78GFN"));
        cars.add(new Car(++COUNT, "Toyota", "белый", "TYA1123456TY78VFR"));
        cars.add(new Car(++COUNT, "Mercedes", "черный", "MCD1123456TY78HFL"));

    }

    @Override
    public List<Car> listAllCar() {
        return cars;
    }

    @Override
    public List<Car> listSoManyCars(Integer quantity) {
        try {
            int i = quantity;
           return i >= cars.size() ? cars : cars.stream().limit(i).collect(Collectors.toList());
        } catch (NumberFormatException e) {
            System.out.println("Введите число");
        }
        return cars;
    }

    @Override
    public void addNewCar(Car car) {
        car.setId(COUNT);
         cars.add(car);
    }
}
