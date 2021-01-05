package com.carorder.app;

public class VanCarType implements CarType {

    private String typeName;
    private CarEngine carEngine;

   public VanCarType(CarEngine carEngine){
       typeName = "Van";
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
