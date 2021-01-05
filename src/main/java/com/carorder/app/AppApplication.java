package com.carorder.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AppApplication.class, args);

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(CarConfig.class);

		CarType car = context.getBean("sedanCarType", CarType.class);

		System.out.println("Pojazd:");
		System.out.println(car.getTypeName());
		System.out.println("Silnik");
		System.out.println(car.getEngine());
		context.close();
	}


}
