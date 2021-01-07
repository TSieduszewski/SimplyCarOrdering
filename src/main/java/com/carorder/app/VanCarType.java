package com.carorder.app;

public class VanCarType implements CarType {

    private String typeName;

   public VanCarType(){
       typeName = "Van";
   }


    @Override
    public String getTypeName() {
        return typeName;
    }




}
