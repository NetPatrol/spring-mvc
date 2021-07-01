package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarsServiceImpl implements CarService {
    private final CarDao carDao;

    @Autowired
    public CarsServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> listAllCar() {
        return carDao.listAllCar();
    }

    @Override
    public List<Car> listSoManyCars(Integer quantity) {
        return carDao.listSoManyCars(quantity);
    }
    @Override
    public void addNewCar(Car car) {
        carDao.addNewCar(car);
    }
}
