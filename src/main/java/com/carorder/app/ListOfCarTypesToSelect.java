package com.carorder.app;

import java.util.ArrayList;
import java.util.HashMap;

public class ListOfCarTypesToSelect implements ListOfCarTypes {

    private HashMap<String, CarType> list;
    private String selection;
    private CarType carType;

    public ListOfCarTypesToSelect(String selection) {
        list = new HashMap<>();
        list.put("Sedan", new SedanCarType());
        list.put("Hatchback", new HatchbackCarType());
        list.put("Cabrio", new CabrioCarType());
        list.put("Kombi", new KombiCarType());
        list.put("SUV", new SUVCarType());
        list.put("Van", new VanCarType());
        this.selection = selection;
    }

    @Override
    public CarType selectedCarType(){
        list.forEach((k,v) ->{
            if(selection.equals(k)){
              carType = list.get(k);
            }
        });
        return carType;
    }

}
