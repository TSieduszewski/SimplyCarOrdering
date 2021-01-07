package com.carorder.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public ListOfCarTypes selectedCarType() {
        return new ListOfCarTypesToSelect("Hatchback");
    }

    @Bean
    public CarEngine selectedCarEngine() {
        return new SelectedCarEngine(selectedCarType().selectedCarType());
    }

    @Bean
    public Order actualOrder() {
        return new ActualOrder(selectedCarType().selectedCarType(), selectedCarEngine());
    }

//    @Bean
//    public CarType sedanCarType() {
//        return new SedanCarType();
//    }

//    @Bean
//    public CarType hatchbackCarType(){
//        return new HatchbackCarType(selectedCarEngine());
//    }
//
//    @Bean
//    public CarType kombiCarType(){
//        KombiCarType kombiCarType = new KombiCarType(selectedCarEngine());
//        return kombiCarType;
//    }
//
//    @Bean
//    public CarType cabrioCarType(){
//        CabrioCarType cabrioCarType = new CabrioCarType(selectedCarEngine());
//
//        return cabrioCarType;
//    }
//
//    @Bean
//    public CarType vanCarType(){
//        VanCarType vanCarType = new VanCarType(selectedCarEngine());
//
//        return vanCarType;
//    }
//
//    @Bean
//    public CarType suvCarType(){
//        SUVCarType suvCarType = new SUVCarType(selectedCarEngine());
//
//        return suvCarType;
//    }
}
