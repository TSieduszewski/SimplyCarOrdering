package com.carorder.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public CarEngine selectedCarEngine(){
        return new SelectedCarEngine();
    }

    @Bean
    public CarType sedanCarType(){
        return new SedanCarType(selectedCarEngine());
    }

    @Bean
    public CarType hatchbackCarType(){
        return new HatchbackCarType(selectedCarEngine());
    }

    @Bean
    public CarType kombiCarType(){
        KombiCarType kombiCarType = new KombiCarType(selectedCarEngine());

        return kombiCarType;
    }

    @Bean
    public CarType cabrioCarType(){
        CabrioCarType cabrioCarType = new CabrioCarType(selectedCarEngine());

        return cabrioCarType;
    }

    @Bean
    public CarType vanCarType(){
        VanCarType vanCarType = new VanCarType(selectedCarEngine());

        return vanCarType;
    }

    @Bean
    public CarType suvCarType(){
        SUVCarType suvCarType = new SUVCarType(selectedCarEngine());

        return suvCarType;
    }
}
