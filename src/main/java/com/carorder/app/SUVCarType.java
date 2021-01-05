package com.carorder.app;

public class SUVCarType implements CarType {

    private String typeName;
    private CarEngine carEngine;

   public SUVCarType(CarEngine carEngine){
       typeName = "SUV";
       this.carEngine = carEngine;
   }


    @Override
    public String getTypeName() {
        return typeName;
    }

    @Override
    public String getEngine() {
        return "Paliwo: " + carEngine.fuelType() + ", pojemność: " + carEngine.literCapacity();
    }


}
