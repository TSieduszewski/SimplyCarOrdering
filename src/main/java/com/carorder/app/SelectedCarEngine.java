package com.carorder.app;

public class SelectedCarEngine implements CarEngine {

    private CarType carType;

    public SelectedCarEngine(CarType cartype){
        this.carType = cartype;
    }

    public SelectedCarEngine(){

    }

    @Override
    public String fuelType() {
        return "Benzyna";
    }

    @Override
    public String literCapacity() {
        return "3.0";
    }
}
