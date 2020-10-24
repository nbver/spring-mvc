package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String series;
    private int vn;

    public static List<Car> listOfCars = new ArrayList<>();
    static{
        Car bmw = new Car("bmw", "z3", 1);
        Car.listOfCars.add(bmw);
        for(int i = 1; i < 5; i++){
            Car.listOfCars.add(new Car("model"+i, "series"+i, i));
        }
    }

    public Car(){}

    public Car(String model, String series, int vn) {
        this.model = model;
        this.series = series;
        this.vn = vn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getVn() {
        return vn;
    }

    public void setVn(int vn) {
        this.vn = vn;
    }

    @Override
    public String toString() {
        return "model = " + model +
                " |   series = " + series +
                " |   vn = " + vn;
    }
}
