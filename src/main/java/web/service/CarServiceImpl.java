package web.service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars(String count) {
        int n = Integer.parseInt(count == null ? "10" : count);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1",1,"red"));
        cars.add(new Car("Car2",2,"black"));
        cars.add(new Car("Car3",3,"blue"));
        cars.add(new Car("Car4",4,"yellow"));
        cars.add(new Car("Car5",5,"green"));
        return cars.stream().limit(n).collect(Collectors.toList());
    }
}
