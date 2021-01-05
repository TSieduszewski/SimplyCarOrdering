package com.carorder.app;

public class KombiCarType implements CarType {

    private String typeName;
    private CarEngine carEngine;

   public KombiCarType(CarEngine carEngine){
       typeName = "Kombi";
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
