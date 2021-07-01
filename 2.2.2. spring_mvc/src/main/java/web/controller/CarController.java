package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;
import web.model.Car;

@Controller
@RequestMapping ("/cars")
public class CarController {
    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String viewCars(@RequestParam(value = "quantity", required = false) Integer quantity, Model model) {
            if (quantity != null) {
                model.addAttribute("cars", service.ShowSoManyCars(quantity));
            } else {
                model.addAttribute("cars", service.listAllCar());
            }
        return "cars/cars";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Car());
        return "cars/create";
    }

    @PostMapping()
    public String create(@ModelAttribute("car") Car car) {
        service.addNewCar(car);
        return "redirect:cars/cars";
    }
}
