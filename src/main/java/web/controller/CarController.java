package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;
@Controller
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", required = false) String count,
                               Model model) {
        model.addAttribute("messages","Cars count = "+ count);
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
