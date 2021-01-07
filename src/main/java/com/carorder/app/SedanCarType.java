package com.carorder.app;

public class SedanCarType implements CarType {

    private String typeName;

   public SedanCarType(){
       typeName = "Sedan";
   }


    @Override
    public String getTypeName() {
        return typeName;
    }



}
