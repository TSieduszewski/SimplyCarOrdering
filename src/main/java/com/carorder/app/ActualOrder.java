package com.carorder.app;

import java.util.Random;

public class ActualOrder implements Order {

    private CarType carType;
    private CarEngine carEngine;

    public ActualOrder(CarType carType, CarEngine carEngine){
        this.carType = carType;
        this.carEngine = carEngine;
    }

    @Override
    public Integer orderNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    @Override
    public String getCarTypeName() {
        return carType.getTypeName();
    }

    @Override
    public String getCarEngine() {
        return "Rodzaj paliwa: " + carEngine.fuelType() + ", pojemność: " + carEngine.literCapacity();
    }
}
