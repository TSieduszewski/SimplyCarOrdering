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

		Order car = context.getBean("actualOrder", Order.class);

		System.out.println("Numer zamówienia:");
		System.out.println(car.orderNumber());
		System.out.println("Pojazd:");
		System.out.println(car.getCarTypeName());
		System.out.println("Silnik");
		System.out.println(car.getCarEngine());
		context.close();
	}


}
