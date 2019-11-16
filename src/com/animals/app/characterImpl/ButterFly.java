package com.animals.app.characterImpl;

import com.animals.app.Animals;
import com.animals.app.character.Fly;

public class ButterFly extends Animals implements Fly{

	@Override
	public void fly() {
		System.err.println("I can fly");
		
	}

}
