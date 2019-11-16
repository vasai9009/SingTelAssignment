package com.animals.app.characterImpl;

import com.animals.app.Animals;
import com.animals.app.character.Swim;

public class Fish extends Animals implements Swim{

	@Override
	public void swim() {
		System.err.println("I can Swim");
		
	}

}
