package com.carorder.app;

public class KombiCarType implements CarType {

    private String typeName;

   public KombiCarType(){
       typeName = "Kombi";
   }


    @Override
    public String getTypeName() {
        return typeName;
    }




}
