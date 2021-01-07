package com.carorder.app;

public class SUVCarType implements CarType {

    private String typeName;

   public SUVCarType(){
       typeName = "SUV";
   }


    @Override
    public String getTypeName() {
        return typeName;
    }




}
