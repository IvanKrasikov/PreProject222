package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", required = false) String count,
                               Model model) {
        model.addAttribute("messages","Cars count = "+ count);
        model.addAttribute("cars", new CarServiceImpl().getCars(count));
        return "cars";
    }
}
