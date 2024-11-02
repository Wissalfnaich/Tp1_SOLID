package com.directi.training.srp.exercise;

import java.util.List;

public class CarComparator {
    public Car findBestCar(List<Car> cars) {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
