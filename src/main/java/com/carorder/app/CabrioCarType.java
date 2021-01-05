package com.carorder.app;

public class CabrioCarType implements CarType {

    private String typeName;
    private CarEngine carEngine;

   public CabrioCarType(CarEngine carEngine){
       typeName = "Cabrio";
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
