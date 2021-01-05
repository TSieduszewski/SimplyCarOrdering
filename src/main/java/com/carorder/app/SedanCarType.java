package com.carorder.app;

public class SedanCarType implements CarType {

    private String typeName;
    private CarEngine carEngine;

   public SedanCarType(CarEngine carEngine){
       typeName = "Sedan";
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
