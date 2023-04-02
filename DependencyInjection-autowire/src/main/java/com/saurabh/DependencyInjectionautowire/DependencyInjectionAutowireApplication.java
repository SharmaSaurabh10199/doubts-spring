package com.saurabh.DependencyInjectionautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DependencyInjectionAutowireApplication {

	@Autowired
	Plane plane;

	public static void main(String[] args) {
		// this returns the spring container which contains all the spring beans
		SpringApplication.run(DependencyInjectionAutowireApplication.class,
				args);
		// here we try to get the object of alien type, but it is not accessible as
		// spring container don't have it till now
		// in order to let spring have that object, we have to use @component directly
		// or indirectly
		// Alien a = context.getBean(Alien.class);
		// a.show();
		// Alien a= new Alien();

	}

	@PostConstruct
	public void doSomething() {
		System.out.println(plane);
		plane.fly();
	}

}
