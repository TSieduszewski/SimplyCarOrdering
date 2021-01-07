package com.carorder.app;


public class HatchbackCarType implements CarType {

    private String typeName;

   public HatchbackCarType(){
       typeName = "Hatchback";
   }


    @Override
    public String getTypeName() {
        return typeName;
    }




}
