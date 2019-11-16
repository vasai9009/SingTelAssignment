package com.animals.app.characterImpl;

import com.animals.app.character.FishProps;

public class Shark extends Fish implements FishProps {

	@Override
	public void color() {
      System.err.println("color grey");
	}

	@Override
	public void size() {
		 System.err.println("size large");
	}

	@Override
	public void swim() {
		super.swim();
	}

	public void food(){
		System.err.println("Eat other fishes");
	}
}
