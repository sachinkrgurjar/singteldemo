package com.example.demo;

import com.example.demo.impl.Bird;
import com.example.demo.impl.CountingAnimals;
import com.example.demo.impl.FishUser;
import com.example.demo.impl.ParrotUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingtelProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelProjectApplication.class, args);
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		ParrotUser parrotUser = new ParrotUser();
		parrotUser.displayParrotProps();
		FishUser fishUser = new FishUser();
		fishUser.displayFishProps();
		CountingAnimals countingAnimals = new CountingAnimals();
		countingAnimals.checkAnimalProps();


	}

}
