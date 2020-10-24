package web.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {


    public int count(){
        return Car.listOfCars.size();
    }
}
