package com.animals.app.characterImpl;

import com.animals.app.character.FishProps;

public class ClownFish extends Fish implements FishProps {

	@Override
	public void color() {
		 System.err.println("color orange");
	}

	@Override
	public void size() {
		 System.err.println("size small");
	}

	public void specialCharacter(){
		System.err.println("Play Jokes");
	}
}
