package com.carorder.app;


public class HatchbackCarType implements CarType {

    private String typeName;
    private CarEngine carEngine;

   public HatchbackCarType( CarEngine carEngine){
       typeName = "Hatchback";
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
