package com.carorder.app;

public class SelectedCarEngine implements CarEngine {


    @Override
    public String fuelType() {
        return "Benzyna";
    }

    @Override
    public String literCapacity() {
        return "3.0";
    }
}
