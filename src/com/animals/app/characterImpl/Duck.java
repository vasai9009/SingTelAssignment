package com.animals.app.characterImpl;

import com.animals.app.Bird;
import com.animals.app.character.Swim;

public class Duck extends Bird implements Swim{

	@Override
	public void singing() {
		System.err.println("Quack, quack");
	}

	@Override
	public void swim() {
		System.err.println("A duck can swim");
	}

}
