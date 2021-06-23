package web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Component
public class CarsServiceImpl implements CarService {
    CarDao carDao;

    @Autowired
    public CarsServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> index() {
        return carDao.index();
    }

    @Override
    public List<Car> count(String i) {
        return carDao.count(i);
    }
    @Override
    public void addNewCar(Car car) {
        carDao.addNewCar(car);
    }
}
