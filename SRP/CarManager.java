package com.directi.training.srp.exercise;

public class CarManager {
    private CarRepository carRepository = new CarRepository();
    private CarFormatter carFormatter = new CarFormatter();
    private CarComparator carComparator = new CarComparator();

    public Car getCarById(final String carId) {
        return carRepository.getCarById(carId);
    }

    public String getCarsNames() {
        return carFormatter.formatCarNames(carRepository.getAllCars());
    }

    public Car getBestCar() {
        return carComparator.findBestCar(carRepository.getAllCars());
    }
}
