package com.animals.app;

import com.animals.app.characterImpl.Chicken;
import com.animals.app.characterImpl.Duck;
import com.animals.app.characterImpl.Parrot;

public class TestMain {

	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.fly();
		bird.singing();
		bird.walk();
		
		Bird chicken = new Chicken();
		chicken.singing();
		Duck duck = new Duck();
		duck.singing();
		
		/* create parrot object according parrots with whom and also need to sound message **/
		Bird parrotWithDogs = new Parrot("Woof, woof");
		parrotWithDogs.singing();
		Bird parrotWithCats = new Parrot("Meow");
		parrotWithCats.singing();
		Bird parrotWithRooster = new Parrot("Cock-a-doodle-doo");
		parrotWithRooster.singing();
	}

}
