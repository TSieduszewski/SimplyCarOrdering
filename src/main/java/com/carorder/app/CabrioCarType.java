package com.carorder.app;

public class CabrioCarType implements CarType {

    private String typeName;
    private CarEngine carEngine;

   public CabrioCarType(){
       typeName = "Cabrio";
   }

    @Override
    public String getTypeName() {
        return typeName;
    }


}
